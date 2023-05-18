package com.laptrinhweb.Entity;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.laptrinhweb.Key.MyLoginKey;

@Entity
@Table(name = "login")
//@IdClass(MyLoginKey.class)
public class LoginEntity {
	@Id
	@Column(name = "username", length = 32)
	private String username;

	@Column(name = "password", length = 128)
	private String password;

	@Column()
	private Boolean role;

	@Column()
	private Date session;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
	private CustomerEntity customer;

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

	public Boolean getRole() {
		return role;
	}

	public void setRole(Boolean role) {
		this.role = role;
	}

	public CustomerEntity getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerEntity customer) {
		this.customer = customer;
	}

	public Date getSession() {
		return session;
	}

	public void setSession(Date session) {
		this.session = session;
	}

	public LoginEntity() {
		super();
	}

	public LoginEntity(String username, String password, Boolean role, Date session, CustomerEntity customer) {
		super();
		this.username = username;
		this.password = password;
		this.role = role;
		this.session = session;
		this.customer = customer;
	}

}
