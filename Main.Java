/*
Author: Trinity Hurtado
Class: Main.java

Description:
Main driver for the Fast Food Ordering System.
Handles user input, menu display, order placement, and processing.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        OrderQueue orderQueue = new OrderQueue();
        OrderStats stats = new OrderStats();
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Fast Food System!");

        while (true) {
            System.out.println("\n1. View Menu");
            System.out.println("2. Place Order");
            System.out.println("3. Process Next Order");
            System.out.println("4. Exit");

            String inputStr = input.nextLine();
            int choice;

            try {
                choice = Integer.parseInt(inputStr);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number 1-4.");
                continue;
            }

            if (choice == 1) {
                menu.displayMenu();
            } else if (choice == 2) {
                Order order = new Order();
                menu.displayMenu();
                System.out.println("Enter item number (-1 to finish):");

                while (true) {
                    inputStr = input.nextLine();
                    int item;
                    try {
                        item = Integer.parseInt(inputStr);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input!");
                        continue;
                    }
                    if (item == -1) break;
                    order.addItem(menu.getItem(item));
                }

                orderQueue.addOrder(order);
                System.out.println("Order added to queue!");
            } else if (choice == 3) {
                if (orderQueue.isEmpty()) {
                    System.out.println("No orders to process!");
                } else {
                    Order processed = orderQueue.processOrder();
                    Receipt receipt = new Receipt();
                    receipt.printReceipt(processed);
                    stats.addOrder(processed);
                    stats.printStats();
                }
            } else if (choice == 4) {
                System.out.println("Exiting system. Goodbye!");
                break;
            } else {
                System.out.println("Please select 1-4.");
            }
        }

        input.close();
    }
}