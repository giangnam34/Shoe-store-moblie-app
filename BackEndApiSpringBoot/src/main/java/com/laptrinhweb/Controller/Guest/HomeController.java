package com.laptrinhweb.Controller.Guest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.laptrinhweb.Service.Implementation.UserDetailService;

@Controller
public class HomeController {
	/*
	 * @Autowired UserDetailService userDetailService;
	 * 
	 * @GetMapping("/home") public String Home(Authentication authentication, Model
	 * model) { if (authentication != null) model.addAttribute("userLogged",
	 * userDetailService.detailUser(authentication.getName())); return "index"; }
	 */
}
