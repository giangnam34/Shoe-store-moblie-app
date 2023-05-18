
package com.laptrinhweb.Convert;

import java.util.Collections;


import org.springframework.stereotype.Component;

import com.laptrinhweb.Entity.LoginEntity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Component
public class UserSecurity {

	/*
	 * LoginEntity user;
	 * 
	 * public UserSecurity() { super(); }
	 * 
	 * public UserSecurity(LoginEntity user) { super(); this.user = user; }
	 * 
	 * @Override public String getPassword() { return user.getPassword(); }
	 * 
	 * @Override public String getUsername() { return user.getUsername(); }
	 * 
	 * @Override public boolean isAccountNonExpired() { return true; }
	 * 
	 * @Override public boolean isAccountNonLocked() { return true; }
	 * 
	 * @Override public boolean isCredentialsNonExpired() { return true; }
	 * 
	 * @Override public boolean isEnabled() { return true; }
	 * 
	 * @Override public java.util.Collection<? extends GrantedAuthority>
	 * getAuthorities() { if (user.getRole() == true) return
	 * Collections.singleton(new SimpleGrantedAuthority("ROLE_ADMIN")); return
	 * Collections.singleton(new SimpleGrantedAuthority("ROLE_USER")); }
	 */
}
