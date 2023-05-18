package com.example.loginregister.model;

import java.sql.Date;
import java.util.List;

public class ShoesOrder {
    private int id;
    private Date order_date;
    private Double discount;
    private Long total_price;
    private Boolean payment_status;
    private User user;
    private List<ProductOrder> productOrders;

    public ShoesOrder(int id, Date order_date, Double discount, Long total_price, Boolean payment_status,
                      User user, List<ProductOrder> productOrders) {
        this.id = id;
        this.order_date = order_date;
        this.discount = discount;
        this.total_price = total_price;
        this.payment_status = payment_status;
        this.user = user;
        this.productOrders = productOrders;
    }

    @Override
    public String toString() {
        return "ShoesOrder{" +
                "id=" + id +
                ", order_date=" + order_date +
                ", discount=" + discount +
                ", total_price=" + total_price +
                ", payment_status=" + payment_status +
                ", user=" + user +
                ", productOrders=" + productOrders +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getOrder_date() {
        return order_date;
    }

    public void setOrder_date(Date order_date) {
        this.order_date = order_date;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Long getTotal_price() {
        return total_price;
    }

    public void setTotal_price(Long total_price) {
        this.total_price = total_price;
    }

    public Boolean getPayment_status() {
        return payment_status;
    }

    public void setPayment_status(Boolean payment_status) {
        this.payment_status = payment_status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<ProductOrder> getProductOrders() {
        return productOrders;
    }

    public void setProductOrders(List<ProductOrder> productOrders) {
        this.productOrders = productOrders;
    }
}
