package com.laptrinhweb.Controller.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.laptrinhweb.Entity.LoginEntity;
import com.laptrinhweb.repository.LoginRepository;

@Controller
public class LoginController {
	@Autowired
	private LoginRepository userRepository;
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	@GetMapping("/register")
	public String register() {
		return "register";
	}
	
	@GetMapping("/logout")
	public String logout() {
		return "logout";
	}
}
