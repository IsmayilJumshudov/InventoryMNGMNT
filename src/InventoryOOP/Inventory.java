package InventoryOOP;

import java.util.ArrayList;

class Inventory {
    private ArrayList<Product> products;

    public Inventory() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayInventory() {
        System.out.println("Current Inventory:");
        for (Product product : products) {
            System.out.println("Name: " + product.getName() + ", Price: $" + product.getPrice() + ", Quantity: " + product.getQuantity());
        }
    }

    public void sellProduct(String name, int quantity) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                if (product.getQuantity() >= quantity) {
                    product.setQuantity(product.getQuantity() - quantity);
                    System.out.println("Sold " + quantity + " " + name + "(s).");
                    return;
                } else {
                    System.out.println("Not enough " + name + " in stock.");
                    return;
                }
            }
        }
        System.out.println("Product not found.");
    }
}