package com.ohgiraffers.section02.superkeyword;

public class Product {
    private String code;
    private String brand;
    private String name;
    private int price;
    private java.util.Date manufactureDate;

    public Product() {
    }

    public Product(String code, String brand, String name, int price, java.util.Date manufactureDate) {
        this.code = code;
        this.brand = brand;
        this.name = name;
        this.price = price;
        this.manufactureDate = manufactureDate;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public java.util.Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(java.util.Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code='" + code + '\'' +
                ", brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", manufactureDate=" + manufactureDate +
                '}';
    }
}
