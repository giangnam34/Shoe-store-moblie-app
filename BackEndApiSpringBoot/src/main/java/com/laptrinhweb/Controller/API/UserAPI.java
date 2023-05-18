package com.laptrinhweb.Controller.API;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.laptrinhweb.Convert.User;
import com.laptrinhweb.DTO.UserDTO;
import com.laptrinhweb.Entity.CustomerEntity;
import com.laptrinhweb.Entity.LoginEntity;
import com.laptrinhweb.Entity.OrderEntity;
import com.laptrinhweb.Service.Implementation.UserService;
import com.laptrinhweb.repository.CustomerRepository;
import com.laptrinhweb.repository.LoginRepository;
import com.laptrinhweb.repository.OrderRepository;

@RestController
public class UserAPI {

	@Autowired
	private UserService userService;
	
	@Autowired
	private LoginRepository loginRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private User userconvert;
	
	@GetMapping("/api/login")
	public UserDTO getLogin(@RequestParam("username") String username, @RequestParam("password") String password){
		List<CustomerEntity> customerList = customerRepository.findAll();
		for (int i = 0; i < customerList.size(); i++)
		{
			if (customerList.get(i).getLogin().getUsername().equals(username) && customerList.get(i).getLogin().getPassword().equals(password))
				return userconvert.toDTO(customerList.get(i));
		}
		UserDTO userDTO = new UserDTO();
		return userDTO;
	}
	
	@PostMapping("/api/user")
	public ResponseEntity<String> addUser(@RequestBody UserDTO user) {
		try {
			if (user == null) {
	            System.out.println("Fail");
				// Trả về kết quả thất bại với HTTP status 400 Bad Request
	            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid user data");
	            
	        }
			System.out.println(user.toString());
			CustomerEntity customerEntity = new CustomerEntity();
			customerEntity.setAddress(user.getAddress());
			customerEntity.setEmail(user.getEmail());
			customerEntity.setImage(user.getImage());
			customerEntity.setName(user.getFullname());
			customerEntity.setPhone(user.getPhone());
			customerEntity.setSex(user.getSex().equals("Male") ? true : false);
			customerEntity.setStatus(true);
			LoginEntity loginEntity = new LoginEntity();
			OrderEntity orderEntity = new OrderEntity();
			customerRepository.save(customerEntity);
			loginEntity.setUsername(user.getUsername());
			loginEntity.setPassword(user.getPassword());
			loginEntity.setCustomer(customerEntity);
			loginEntity.setRole(false);
			loginRepository.save(loginEntity);
			orderEntity.setCustomer(customerEntity);
			customerRepository.save(customerEntity);
			orderRepository.save(orderEntity);
            System.out.println("Success");
			return ResponseEntity.status(HttpStatus.OK).body("Success created");
		} catch(Exception e) {
            System.out.println("Fail");
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to create user");
		}
    }
	
	@PostMapping("/checkout/{username}")
	public ResponseEntity<String> checkout(@PathVariable("username") String username){
		try {
		CustomerEntity customerEntity = loginRepository.findById(username).get().getCustomer();
		List<OrderEntity> orderList = orderRepository.findAll();
		OrderEntity orderEntity = new OrderEntity();
		for (int i = 0; i < orderList.size(); i++) {
			if (orderList.get(i).getCustomer().getId() == customerEntity.getId()) orderEntity = orderList.get(i);
		}
		orderEntity.setPayment_status(true);
		orderRepository.save(orderEntity);
		OrderEntity newOrder = new OrderEntity();
		newOrder.setCustomer(customerEntity);
		//newOrder.setTotal_price(0L);
		orderRepository.save(newOrder);
		return ResponseEntity.status(HttpStatus.OK).body("Success checkout");
		} catch(Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Checkout fail");
		}
	}
}
