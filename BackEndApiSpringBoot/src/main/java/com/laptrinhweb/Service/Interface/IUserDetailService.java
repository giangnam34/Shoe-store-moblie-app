package com.laptrinhweb.Service.Interface;

import com.laptrinhweb.DTO.UserDTO;

public interface IUserDetailService {

	UserDTO detailUser(String username);

	String updateInfoUser(String username, String fullname, String phone, String sex, String address);

	String addProductToCart(String pid, String username, Long quantity);

	Long total(String username);

	String removeProductToCart(String pid, String username);

}
