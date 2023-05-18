package com.example.loginregister.model;

public class ProductOrder {
    private ProductOrderKey id;
    private ShoesOrder order;
    private int quantity;

    public ProductOrderKey getId() {
        return id;
    }

    public void setId(ProductOrderKey id) {
        this.id = id;
    }

    public ShoesOrder getOrder() {
        return order;
    }

    public void setOrder(ShoesOrder order) {
        this.order = order;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public ProductOrder(ProductOrderKey id, ShoesOrder order, int quantity) {
        this.id = id;
        this.order = order;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "ProductOrder{" +
                "id=" + id +
                ", order=" + order +
                ", quantity=" + quantity +
                '}';
    }
}
