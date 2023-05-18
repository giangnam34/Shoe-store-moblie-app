package com.laptrinhweb.Convert;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.laptrinhweb.DTO.UserDTO;
import com.laptrinhweb.Entity.CustomerEntity;
import com.laptrinhweb.Entity.LoginEntity;
import com.laptrinhweb.Entity.OrderEntity;
import com.laptrinhweb.Entity.ProductOrderEntity;
import com.laptrinhweb.repository.CustomerRepository;
import com.laptrinhweb.repository.LoginRepository;
import com.laptrinhweb.repository.ProductOrderRepository;

@Component
public class User {
	@Autowired
	CustomerRepository userRepository;
	@Autowired
	LoginRepository loginRepository;
	@Autowired
	ProductOrderRepository productOrderRepository;
	public CustomerEntity toEntity(UserDTO user) {
		if (userRepository.findById(user.getId()).get() != null) return userRepository.findById(user.getId()).get();
		return null;
	}
	public UserDTO toDTO(CustomerEntity user) {
		UserDTO userDTO = new UserDTO();
		userDTO.setId(user.getId());
		userDTO.setAddress(user.getAddress());
		userDTO.setEmail(user.getEmail());
		userDTO.setImage(user.getImage());
		for (LoginEntity x: loginRepository.findAll()) {
			if (x.getCustomer().getId() == user.getId()) {
				userDTO.setUsername(x.getUsername());
			}
		}
		userDTO.setPhone(user.getPhone());
		if (user.getSex() == true) userDTO.setSex("Nam");
		else userDTO.setSex("Nữ");
		userDTO.setFullname(user.getName());
		List <ProductOrderEntity> product_list = new ArrayList<ProductOrderEntity>(); 
		OrderEntity order_new = new OrderEntity();
		for (OrderEntity x: user.getOrders()) {
			if (x.getCustomer().getId() == user.getId()) {
				order_new = x;
			}
		}
		for (ProductOrderEntity x: productOrderRepository.findAll()) {
			if (x.getOrder().getId() == order_new.getId()) {
				product_list.add(x);
			}
		}
		userDTO.setOrders(product_list);
		return userDTO;
	}
}
