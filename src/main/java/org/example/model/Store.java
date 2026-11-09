package org.example.model;

public class Store {

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
            System.out.println("--------------------");
        }
    }

    public static void main(String[] args) {

        ProductForSale[] products = {
                new Chocolate("Dark Chocolate", 120.0, "Rich dark chocolate", 70),
                new Coke("Coca-Cola", 50.0, "Refreshing soft drink", 330),
                new Bread("Bread", 30.0, "Freshly baked bread", "Whole Wheat")
        };

        listProducts(products);
    }
}