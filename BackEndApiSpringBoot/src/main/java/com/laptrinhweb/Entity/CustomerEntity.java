package com.laptrinhweb.Entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class CustomerEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customer_id")
	private Long id;

	@Column()
	private String name;

	@Column()
	private String phone;

	@Column()
	private String address;

	@Column()
	private Boolean sex;

	@Column()
	private String email;

	@Column()
	private String image;

	@Column()
	private Boolean status;

	@OneToOne(mappedBy = "customer")
	private LoginEntity login;

	@OneToMany(mappedBy = "customer")
	private List<OrderEntity> orders;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Boolean getSex() {
		return sex;
	}

	public void setSex(Boolean sex) {
		this.sex = sex;
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

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public LoginEntity getLogin() {
		return login;
	}

	public void setLogin(LoginEntity login) {
		this.login = login;
	}

	public List<OrderEntity> getOrders() {
		return orders;
	}

	public void setOrders(List<OrderEntity> orders) {
		this.orders = orders;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public CustomerEntity() {
		super();
	}

	public CustomerEntity(Long id, String name, String phone, String address, Boolean sex, String email, String image,
			Boolean status, LoginEntity login, List<OrderEntity> orders) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.sex = sex;
		this.email = email;
		this.image = image;
		this.status = status;
		this.login = login;
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "CustomerEntity [id=" + id + ", name=" + name + ", phone=" + phone + ", address=" + address + ", sex="
				+ sex + ", email=" + email + ", image=" + image + ", status=" + status + ", login=" + login
				+ ", orders=" + orders + "]";
	}
	

}
