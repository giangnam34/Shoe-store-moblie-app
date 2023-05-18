package com.laptrinhweb.Controller.API;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laptrinhweb.Convert.Product;
import com.laptrinhweb.DTO.ProductDTO;
import com.laptrinhweb.Entity.CustomerEntity;
import com.laptrinhweb.Entity.OrderEntity;
import com.laptrinhweb.Entity.ProductEntity;
import com.laptrinhweb.Entity.ProductOrderEntity;
import com.laptrinhweb.Key.ProductOrderKey;
import com.laptrinhweb.Service.Implementation.ProductService;
import com.laptrinhweb.repository.CustomerRepository;
import com.laptrinhweb.repository.LoginRepository;
import com.laptrinhweb.repository.OrderRepository;
import com.laptrinhweb.repository.ProductOrderRepository;
import com.laptrinhweb.repository.ProductRepository;

@RestController
public class ProductAPI {

	@Autowired
	ProductService productService;
	
	@Autowired
	ProductRepository productRepository;
	
	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	LoginRepository loginRepository;
	
	@Autowired
	OrderRepository orderRepository;
	
	@Autowired
	ProductOrderRepository productOrderRepository;
	
	@Autowired
	Product productConvert;
	
	@GetMapping("/api/product")
	public List<ProductDTO> getAllProduct(){
		return productService.getAllProduct(); 
	}
	
	@GetMapping("/api/productorder/{username}")
	public List<ProductDTO> getProductOrder(@PathVariable("username") String username){
		List<ProductDTO> result = new ArrayList<>();
		CustomerEntity customerEntity = loginRepository.findById(username).get().getCustomer();
		List<OrderEntity> orderList = orderRepository.findAll();
		OrderEntity orderEntity = new OrderEntity();
		int flag = 0;
		for (int i = 0; i < orderList.size(); i++) {
			if (orderList.get(i).getCustomer().getId() == customerEntity.getId()) {
				orderEntity = orderList.get(i);
				flag = 1;
				}
			}
		if (flag == 0) return result;
		List<ProductOrderEntity> productOrderList = productOrderRepository.findAll();
		for (int i = 0; i < productOrderList.size(); i++) {
			if (productOrderList.get(i).getId().getOrderid() == orderEntity.getId()) {
				result.add(productConvert.toDTO(productRepository.findById(productOrderList.get(i).getId().getProductid()).get()));
				result.get(result.size()-1).setPrice(productRepository.findById(productOrderList.get(i).getId().getProductid()).get().getMoney()*productOrderList.get(i).getQuantity());
			}
			}
		return result;
	}
	
	@GetMapping("/api/product/{name}")
	public List<ProductDTO> getAllProductByName(@PathVariable("name") String name){
		List<ProductDTO> productList = productService.getAllProduct();
		List<ProductDTO> result = new ArrayList<ProductDTO>();
		for (int i = 0; i < productList.size(); i++) {
			if (productList.get(i).getName().toUpperCase().contains(name.toUpperCase())
			   || productList.get(i).getBrand().toUpperCase().contains(name.toUpperCase())
			   || productList.get(i).getCategory().toUpperCase().contains(name.toUpperCase())
			   || productList.get(i).getPrice().toString().contains(name)) result.add(productList.get(i));
		}
		return result;
	}
	@PostMapping("/api/product/{id}/{quantity}/user/{username}")
	public ResponseEntity<String> createProduct(@PathVariable("id") Long id, @PathVariable("quantity") Long quantity,
												@PathVariable("username") String username) {
		try {
		ProductEntity productEntity = productRepository.findById(id).get();
		CustomerEntity customerEntity = loginRepository.findById(username).get().getCustomer();
		List<OrderEntity> orderList = orderRepository.findAll();
		OrderEntity orderEntity = new OrderEntity();
		for (int i = 0; i < orderList.size(); i++) {
			if (orderList.get(i).getCustomer().getId() == customerEntity.getId()) orderEntity = orderList.get(i);
		}
		ProductOrderKey key = new ProductOrderKey();
		key.setOrderid(orderEntity.getId());
		key.setProductid(productEntity.getId());
		System.out.println(100);
		ProductOrderEntity productOrderEntity = new ProductOrderEntity();
		List<ProductOrderEntity> productOrderList = productOrderRepository.findAll();
		for (int i = 0; i < productOrderList.size(); i++) {
			if (productOrderList.get(i).getId().getProductid() == id &&
				productOrderList.get(i).getId().getOrderid() == orderEntity.getId()) productOrderEntity = productOrderList.get(i);
		}
		productOrderEntity.setId(key);
		productOrderEntity.setOrder(orderEntity);
		productOrderEntity.setProduct(productEntity);
		System.out.println(1);
		productOrderEntity.setQuantity( (productOrderEntity.getQuantity() == null ? 0 : productOrderEntity.getQuantity()) + quantity);
		orderEntity.setTotal_price( (orderEntity.getTotal_price()== null ? 0 : orderEntity.getTotal_price()) + quantity*productEntity.getMoney());
		System.out.println(10);
		productEntity.setStock(productEntity.getStock() - quantity);
		productRepository.save(productEntity);
		orderRepository.save(orderEntity);
		productOrderRepository.save(productOrderEntity);
		customerRepository.save(customerEntity);
		return ResponseEntity.status(HttpStatus.OK).body("Add product success");
		} catch (Exception e) {
			System.out.println(e);
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Add product fail");
		}
	}
}
