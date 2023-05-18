package com.laptrinhweb.Controller.Customer;

import java.util.List;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.laptrinhweb.DTO.ProductDTO;
import com.laptrinhweb.Service.Implementation.UserDetailService;

@Controller
public class ProfileController {
	/*
	 * @Autowired UserDetailService userDetailService;
	 * 
	 * @GetMapping("/profile") public String profile(Authentication authentication,
	 * Model model) {
	 * 
	 * Logger logger = LoggerFactory.getLogger(ProfileController.class);
	 * logger.error(userDetailService.detailUser(authentication.getName()).
	 * getFullname());
	 * 
	 * if (authentication != null) { model.addAttribute("userLogged",
	 * userDetailService.detailUser(authentication.getName())); } return "profile";
	 * }
	 * 
	 * @GetMapping("/update-profile") public String updateProfile(Authentication
	 * authentication, Model model) {
	 * 
	 * Logger logger = LoggerFactory.getLogger(ProfileController.class);
	 * logger.error(userDetailService.detailUser(authentication.getName()).
	 * getFullname());
	 * 
	 * if (authentication != null) model.addAttribute("userLogged",
	 * userDetailService.detailUser(authentication.getName())); return
	 * "edit_profile"; }
	 * 
	 * @GetMapping("/update") public String updateProfile(Authentication
	 * authentication, Model model, RedirectAttributes redirectAttributes,
	 * 
	 * @RequestParam(name = "username", required = true) String username,
	 * 
	 * @RequestParam(name = "name", required = false) String fullname,
	 * 
	 * @RequestParam(name = "phone", required = false) String phone,
	 * 
	 * @RequestParam(name = "sex", required = false) String sex,
	 * 
	 * @RequestParam(name = "address", required = false) String address) {
	 * 
	 * org.slf4j.Logger logger = LoggerFactory.getLogger(ProfileController.class);
	 * logger.error(username); logger.error(fullname); logger.error(phone);
	 * logger.error(sex); logger.error(address);
	 * 
	 * if (authentication != null) model.addAttribute("userLogged",
	 * userDetailService.detailUser(authentication.getName())); if
	 * (userDetailService.updateInfoUser(username, fullname, phone, sex,
	 * address).equals("Cập nhật thành công!!!")) { //Logger logger =
	 * LoggerFactory.getLogger(ProfileController.class); //logger.error("Success");
	 * redirectAttributes.addFlashAttribute("messagesuccess",
	 * userDetailService.updateInfoUser(username, fullname, phone, sex, address)); }
	 * else { //Logger logger = LoggerFactory.getLogger(ProfileController.class);
	 * //logger.error("Fail"); redirectAttributes.addFlashAttribute("messagefail",
	 * userDetailService.updateInfoUser(username, fullname, phone, sex, address)); }
	 * return "redirect:/profile"; }
	 */

}
