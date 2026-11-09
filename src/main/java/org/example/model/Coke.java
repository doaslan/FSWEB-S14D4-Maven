package org.example.model;

public class Coke extends ProductForSale {

    private int volume;

    public Coke(String type, double price, String description, int volume) {
        super(type, price, description);
        this.volume = volume;
    }

    public Coke(String type, double price, String description) {
        super(type, price, description);
        this.volume = 330;
    }

    @Override
    public void showDetails() {
        System.out.println("Coke: " + getType());
        System.out.println("Price: " + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Volume: " + volume + " ml");
    }
}