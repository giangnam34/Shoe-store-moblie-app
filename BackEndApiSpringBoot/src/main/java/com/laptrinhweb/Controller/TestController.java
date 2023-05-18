package com.laptrinhweb.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.laptrinhweb.Controller.Customer.ProfileController;

@Controller
public class TestController {

	@GetMapping("/test")
	public String Test() {
		/*
		 * Logger logger = LoggerFactory.getLogger(ProfileController.class);
		 * logger.error(authentication.getName());
		 */
		return "index";
	}
}
