package InventoryOOP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventory inventory = new Inventory();

        inventory.addProduct(new Product("Laptop", 999.99, 10));
        inventory.addProduct(new Product("Phone", 699.99, 15));
        inventory.addProduct(new Product("Tablet", 299.99, 20));

        while (true) {
            System.out.println("\nInventory Management System");
            System.out.println("1. Display Inventory");
            System.out.println("2. Sell Product");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    inventory.displayInventory();
                    break;
                case 2:
                    scanner.nextLine(); 
                    System.out.print("Enter product name: ");
                    String productName = scanner.nextLine();
                    System.out.print("Enter quantity to sell: ");
                    int quantity = scanner.nextInt();
                    inventory.sellProduct(productName, quantity);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}