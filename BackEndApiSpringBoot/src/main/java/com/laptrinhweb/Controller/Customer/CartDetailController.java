package com.laptrinhweb.Controller.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.laptrinhweb.Service.Implementation.ProductService;
import com.laptrinhweb.Service.Implementation.UserDetailService;

@Controller
public class CartDetailController {
	/*
	 * @Autowired UserDetailService userDetailService;
	 * 
	 * @Autowired ProductService productService;
	 * 
	 * @GetMapping("/cartdetail") public String cartdetail(Authentication
	 * authentication, Model model) { return "shopping-cart"; }
	 * 
	 * @GetMapping("/checkout") public String checkout() { return "checkout"; }
	 * 
	 * @GetMapping("/cart") public String addProductToCart(Authentication
	 * authentication, Model model,
	 * 
	 * @RequestParam(name = "pid", required = true) String pid,
	 * 
	 * @RequestParam(name = "username", required = true) String username,
	 * RedirectAttributes redirectAttributes) { String result =
	 * userDetailService.addProductToCart(pid, username, 1L); if
	 * (result.equals("Thêm sản phẩm vào giỏ hàng thành công!!!")) {
	 * redirectAttributes.addFlashAttribute("messagesuccess", result); } else
	 * redirectAttributes.addFlashAttribute("messagefail", result); return
	 * "redirect:/shop"; }
	 * 
	 * @GetMapping("/addcart") public String addProduct(Authentication
	 * authentication, Model model,
	 * 
	 * @RequestParam(name = "pid", required = true) String pid,
	 * 
	 * @RequestParam(name = "username", required = true) String username,
	 * RedirectAttributes redirectAttributes) { String result =
	 * userDetailService.addProductToCart(pid, username, 1L); if
	 * (result.equals("Thêm sản phẩm vào giỏ hàng thành công!!!")) {
	 * redirectAttributes.addFlashAttribute("messagesuccess", result); } else
	 * redirectAttributes.addFlashAttribute("messagefail", result);
	 * redirectAttributes.addAttribute("pid",pid); return
	 * "redirect:/product-detail"; }
	 * 
	 * @GetMapping("/updatecart") public String addProduct(Authentication
	 * authentication, Model model,
	 * 
	 * @RequestParam(name = "pid", required = true) String pid,
	 * 
	 * @RequestParam(name = "username", required = true) String username,
	 * 
	 * @RequestParam(name = "quantity", required = true) String quantity,
	 * RedirectAttributes redirectAttributes) { if (authentication != null)
	 * redirectAttributes.addFlashAttribute("totalprice",
	 * userDetailService.total(authentication.getName())); String result = ""; if
	 * (quantity.equals("-1")) result = userDetailService.addProductToCart(pid,
	 * username, -1L); else result = userDetailService.addProductToCart(pid,
	 * username, 1L); if (result.equals("Thêm sản phẩm vào giỏ hàng thành công!!!"))
	 * { redirectAttributes.addFlashAttribute("messagesuccess",
	 * "Cập nhật số lượng sản phẩm thành công!!!"); } else
	 * redirectAttributes.addFlashAttribute("messagefail",
	 * "Cập nhật số lượng sản phẩm thất bại!!!"); return "redirect:/cartdetail"; }
	 * 
	 * @GetMapping("/deletecart") public String removeProductToCart(Authentication
	 * authentication, Model model,
	 * 
	 * @RequestParam(name = "pid", required = true) String pid,
	 * 
	 * @RequestParam(name = "username", required = true) String username,
	 * RedirectAttributes redirectAttributes) { String result =
	 * userDetailService.removeProductToCart(pid, username); if
	 * (result.equals("Xóa sản phẩm khỏi giỏ hàng thành công!!!"))
	 * redirectAttributes.addFlashAttribute("messagesuccess", result); else
	 * redirectAttributes.addFlashAttribute("messagefail",
	 * "Cập nhật số lượng sản phẩm thành công!!!"); if (authentication != null)
	 * redirectAttributes.addFlashAttribute("totalprice",
	 * userDetailService.total(authentication.getName())); return
	 * "redirect:/cartdetail"; }
	 */
}
