package com.example.loginregister.model;

import java.util.List;

public class User {
    private int id;
    private String address;
    private String email;
    private String image;
    private String fullname;
    private String phone;
    private String sex;
    private Boolean status;
    private String username;
    private String password;

    private List<ShoesOrder> orders;

    public User() {
    }

    public User(int id, String address, String email, String image, String fullname, String phone, String sex,
                Boolean status, String username, String password, List<ShoesOrder> orders) {
        this.id = id;
        this.address = address;
        this.email = email;
        this.image = image;
        this.fullname = fullname;
        this.phone = phone;
        this.sex = sex;
        this.status = status;
        this.username = username;
        this.password = password;
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", image='" + image + '\'' +
                ", fullname='" + fullname + '\'' +
                ", phone='" + phone + '\'' +
                ", sex='" + sex + '\'' +
                ", status=" + status +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", orders=" + orders +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public List<ShoesOrder> getOrders() {
        return orders;
    }

    public void setOrders(List<ShoesOrder> orders) {
        this.orders = orders;
    }
}
