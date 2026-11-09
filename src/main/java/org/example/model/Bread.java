package org.example.model;

public class Bread extends ProductForSale {

    private String breadType;

    public Bread(String type, double price, String description, String breadType) {
        super(type, price, description);
        this.breadType = breadType;
    }

    public Bread(String type, double price, String description) {
        super(type, price, description);
        this.breadType = "White";
    }

    @Override
    public void showDetails() {
        System.out.println("Bread: " + getType());
        System.out.println("Price: " + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Bread Type: " + breadType);
    }
}