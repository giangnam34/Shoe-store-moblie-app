package com.laptrinhweb.Service.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laptrinhweb.Convert.UserSecurity;
import com.laptrinhweb.Entity.LoginEntity;
import com.laptrinhweb.repository.LoginRepository;

@Service
public class UserService{
	@Autowired
	private LoginRepository userRepository;
	
	/*
	 * @Override public UserDetails loadUserByUsername(String username) {
	 * LoginEntity user = userRepository.findById(username).get(); if (user == null)
	 * { throw new UsernameNotFoundException("Not found user"); } return new
	 * UserSecurity(user); }
	 */
	
}
