package org.nbguzman.hive.model;

public class Product {
    private Long id;
    private String name;
    private double price;
    private String description;

    public Product(Object id, Object name, Object price) {
    }

    public Object getName() {
        return name;
    }

    public Object getPrice() {
        return price;
    }

    // Constructors, Getters, and Setters
}
