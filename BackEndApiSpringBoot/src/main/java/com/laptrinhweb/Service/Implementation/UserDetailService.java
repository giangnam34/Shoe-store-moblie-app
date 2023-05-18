package com.laptrinhweb.Service.Implementation;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laptrinhweb.Convert.User;
import com.laptrinhweb.DTO.UserDTO;
import com.laptrinhweb.Entity.CustomerEntity;
import com.laptrinhweb.Entity.LoginEntity;
import com.laptrinhweb.Entity.OrderEntity;
import com.laptrinhweb.Entity.ProductEntity;
import com.laptrinhweb.Entity.ProductOrderEntity;
import com.laptrinhweb.Key.ProductOrderKey;
import com.laptrinhweb.Service.Interface.IUserDetailService;
import com.laptrinhweb.repository.CustomerRepository;
import com.laptrinhweb.repository.LoginRepository;
import com.laptrinhweb.repository.OrderRepository;
import com.laptrinhweb.repository.ProductOrderRepository;
import com.laptrinhweb.repository.ProductRepository;

@Service
public class UserDetailService implements IUserDetailService{
	@Autowired
	LoginRepository loginRepository;
	@Autowired
	CustomerRepository userRepository;
	@Autowired
	User user;
	@Autowired
	OrderRepository orderRepository;
	@Autowired
	ProductRepository productRepository;
	@Autowired
	ProductOrderRepository productOrderRepository;
	
	@Override
	public UserDTO detailUser(String username) {
		for (LoginEntity x: loginRepository.findAll()) {
			if (x.getUsername().equals(username)) {
				return user.toDTO(x.getCustomer());
			}
		}
		return null;
	}
	
	@Override
	public String updateInfoUser(String username, String fullname, String phone, String sex, String address) {
		try {
		LoginEntity loginEntity = loginRepository.findById(username).get();
		CustomerEntity userEntity = loginEntity.getCustomer();
		if (fullname.isEmpty() && phone.isEmpty() && sex.equals("Chọn giới tính") && address.isEmpty()) return "Vui lòng nhập thông tin cần chỉnh sửa!";
		if (fullname != "") userEntity.setName(fullname);
		if (phone != "") userEntity.setPhone(phone);
		if (sex != "") {
			if (sex.equals("Nam")) userEntity.setSex(true);
			else userEntity.setSex(false);
		}
		if (address != "") userEntity.setAddress(address);
		userRepository.save(userEntity);
		return "Cập nhật thành công!!!";
		}
		catch(Exception e) {
			return "Cập nhất thất bại!!!";
		}
	}
	
	@Override
	public String addProductToCart(String pid, String username, Long quantity) {
		try {
		OrderEntity orderEntity = new OrderEntity();
		LoginEntity loginEntity = loginRepository.findById(username).get();
		CustomerEntity userEntity = loginEntity.getCustomer();
		ProductEntity productEntity = productRepository.findById(Long.parseLong(pid)).get();
		for (OrderEntity x: orderRepository.findAll()) {
			if (x.getCustomer().getId() == userEntity.getId() ) {
				orderEntity = x;
			}
		}
		if (orderEntity.getCustomer() == null) {
			orderEntity.setCustomer(userEntity);
			orderEntity.setPayment_status(false);
			orderEntity.setDiscount(0.0);
			orderEntity.setTotal_price(0L);
			orderRepository.save(orderEntity);
			for (OrderEntity x: orderRepository.findAll()) {
				if (x.getCustomer().getId() == userEntity.getId() ) {
					orderEntity = x;
				}
			}
		}
		Logger logger = LoggerFactory.getLogger(UserDetailService.class);
		ProductOrderEntity productOrderEntity = new ProductOrderEntity();
		Double total = orderEntity.getTotal_price() + productEntity.getMoney()*quantity*( (100.0-productEntity.getDiscount())/100.0 );
		orderEntity.setTotal_price(Math.round(total));
		for (ProductOrderEntity x : productOrderRepository.findAll()) {
			if (x.getProduct().getId() == productEntity.getId() && x.getOrder().getId() == orderEntity.getId()) {
				productOrderEntity = x;
			}
		}
		if (productOrderEntity.getProduct() != null) {
			productOrderEntity.setQuantity(productOrderEntity.getQuantity() + quantity);
		}
		else {
			ProductOrderKey productOrderKey = new ProductOrderKey(productEntity.getId(),orderEntity.getId());
			productOrderEntity.setOrder(orderEntity);
			productOrderEntity.setProduct(productEntity);		
			productOrderEntity.setQuantity(quantity);
			productOrderEntity.setId(productOrderKey);
		}
		productOrderRepository.save(productOrderEntity);
		orderRepository.save(orderEntity);
		return "Thêm sản phẩm vào giỏ hàng thành công!!!";
		} catch(Exception e) {
			Logger logger = LoggerFactory.getLogger(UserDetailService.class);
			logger.error(e.toString());
			return "Thêm sản phẩm vào giỏ hàng thất bại!!!";
		}
	}
	@Override
	public String removeProductToCart(String pid, String username) {
		try {
			OrderEntity orderEntity = new OrderEntity();
			LoginEntity loginEntity = loginRepository.findById(username).get();
			CustomerEntity userEntity = loginEntity.getCustomer();
			ProductEntity productEntity = productRepository.findById(Long.parseLong(pid)).get();
			for (OrderEntity x: orderRepository.findAll()) {
				if (x.getCustomer().getId() == userEntity.getId() ) {
					orderEntity = x;
				}
			}
			List <ProductOrderEntity> product_list = productOrderRepository.findAll();
			for (ProductOrderEntity x : product_list) {
				if (x.getProduct().getId() == productEntity.getId() && x.getOrder().getId() == orderEntity.getId()) {
					orderEntity.setTotal_price(orderEntity.getTotal_price() - x.getQuantity()*productEntity.getMoney());
					orderRepository.save(orderEntity);
					productOrderRepository.delete(x);
				}
			}
			return "Xóa sản phẩm khỏi giỏ hàng thành công!!!";
		} catch (Exception e) {
			return "Xóa sản phẩm khỏi giỏ hàng thất bại!!!";
		}
	}
	
	@Override
	public Long total(String username) {
		OrderEntity orderEntity = new OrderEntity();
		LoginEntity loginEntity = loginRepository.findById(username).get();
		CustomerEntity userEntity = loginEntity.getCustomer();
		for (OrderEntity x: orderRepository.findAll()) {
			if (x.getCustomer().getId() == userEntity.getId() ) {
				orderEntity = x;
			}
		}
		if (orderEntity.getCustomer() != null) return orderEntity.getTotal_price();
		else return 0L;
	}
}
