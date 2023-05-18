package com.laptrinhweb.Controller.Guest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.laptrinhweb.DTO.BrandDTO;
import com.laptrinhweb.DTO.ProductDTO;
import com.laptrinhweb.DTO.UserDTO;
import com.laptrinhweb.Service.Implementation.BrandService;
import com.laptrinhweb.Service.Implementation.ProductService;
import com.laptrinhweb.Service.Implementation.UserDetailService;

@Controller
public class ShopController {
	/*
	 * @Autowired ProductService productService;
	 * 
	 * @Autowired BrandService brandService;
	 * 
	 * @Autowired UserDetailService userDetailService;
	 * 
	 * @ModelAttribute("allproduct") public List<ProductDTO> getAllProduct() {
	 * return productService.getAllProduct(); }
	 * 
	 * @ModelAttribute("brandlist") public List<BrandDTO> getAllBrand() { return
	 * brandService.getAllBrand(); }
	 * 
	 * @ModelAttribute("userLogged") public UserDTO getUserName(Authentication
	 * authentication) { if (authentication != null) return
	 * userDetailService.detailUser(authentication.getName()); return null; }
	 * 
	 * @GetMapping("/shop") public String Shop(Model model, @RequestParam(name =
	 * "brandname", required = false) String brandname,
	 * 
	 * @RequestParam(name = "category", required = false) String category,
	 * 
	 * @RequestParam(name = "sort", required = false) String sort,
	 * 
	 * @RequestParam(name = "search", required = false) String search) {
	 * List<ProductDTO> product = (List<ProductDTO>)
	 * model.getAttribute("allproduct"); if (brandname != null) {
	 * model.addAttribute("allproduct",
	 * productService.getByBrand(product,brandname)); } if (category != null) {
	 * model.addAttribute("allproduct",
	 * productService.getByCategory(product,category)); } if (sort != null) {
	 * model.addAttribute("allproduct", productService.sortBy(product, sort)); } if
	 * (search != null) { model.addAttribute("allproduct",
	 * productService.searchBy(product, search)); } return "shop"; }
	 * 
	 * @GetMapping("/product-detail") public String product_detail(Model
	 * model, @RequestParam(name = "pid", required = true) String pid) {
	 * model.addAttribute("product",productService.findbyId(pid)); return
	 * "shop-details"; }
	 */
}
