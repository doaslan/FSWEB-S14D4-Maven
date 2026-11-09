package org.example.model;

public class Chocolate extends ProductForSale {

    private int cocoaPercentage;

    public Chocolate(String type, double price, String description, int cocoaPercentage) {
        super(type, price, description);
        this.cocoaPercentage = cocoaPercentage;
    }

    public Chocolate(String type, double price, String description) {
        super(type, price, description);
        this.cocoaPercentage = 0;
    }

    @Override
    public void showDetails() {
        System.out.println("Chocolate: " + getType());
        System.out.println("Price: " + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Cocoa Percentage: " + cocoaPercentage + "%");
    }
}