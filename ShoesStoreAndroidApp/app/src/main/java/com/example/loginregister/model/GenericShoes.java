package com.example.loginregister.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

public class GenericShoes {
    private int id;
    private String name;
    private double price;
    private String image;
    //private int categoryId;
    private int sold_quantity;
    private int stock;
    private String description;
    private List<String> color;
    private List<Double> size;
    private String category;
    private String brand;

    public GenericShoes(int id, String name, double price, String image, int sold_quantity, int stock, String description,
                        List<String> color, List<Double> size, String category, String brand) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.image = image;
        this.sold_quantity = sold_quantity;
        this.stock = stock;
        this.description = description;
        this.color = color;
        this.size = size;
        this.category = category;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "GenericShoes{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", image='" + image + '\'' +
                ", sold_quantity=" + sold_quantity +
                ", stock=" + stock +
                ", description='" + description + '\'' +
                ", color=" + color +
                ", size=" + size +
                ", category='" + category + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getSold_quantity() {
        return sold_quantity;
    }

    public void setSold_quantity(int sold_quantity) {
        this.sold_quantity = sold_quantity;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getColor() {
        return color;
    }

    public void setColor(List<String> color) {
        this.color = color;
    }

    public List<Double> getSize() {
        return size;
    }

    public void setSize(List<Double> size) {
        this.size = size;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
