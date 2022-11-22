package com.jap.product.domain;

public class Product {
    private int id;
    private String name;
    private String description;
    private double amount;

    public Product(int id, String name, String description, double amount) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.amount = amount;
    }

    public Product() {
    }


}
