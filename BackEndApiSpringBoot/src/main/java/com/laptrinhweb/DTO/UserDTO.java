package com.laptrinhweb.DTO;

import java.util.List;

import com.laptrinhweb.Entity.OrderEntity;
import com.laptrinhweb.Entity.ProductOrderEntity;

public class UserDTO {
	private Long id;
	private String address;
	private String email;
	private String image;
	private String fullname;
	private String phone;
	private String sex;
	private Boolean status;
	private String username;
	private String password;
	private List<ProductOrderEntity> orders;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<ProductOrderEntity> getOrders() {
		return orders;
	}
	public void setOrders(List<ProductOrderEntity> orders) {
		this.orders = orders;
	}
	public UserDTO() {
		super();
	}
	public UserDTO(Long id, String address, String email, String image, String fullname, String phone, String sex,
			Boolean status, String username) {
		super();
		this.id = id;
		this.address = address;
		this.email = email;
		this.image = image;
		this.fullname = fullname;
		this.phone = phone;
		this.sex = sex;
		this.status = status;
		this.username = username;
	}
	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", address=" + address + ", email=" + email + ", image=" + image + ", fullname="
				+ fullname + ", phone=" + phone + ", sex=" + sex + ", status=" + status + ", username=" + username
				+ ", password=" + password + ", orders=" + orders + "]";
	}
	
}
