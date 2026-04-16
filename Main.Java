/* 
Name: Trinity Hurtado 
Class: Main.java
Description: This is the main driver of the Fast Food Ordering System. It handles user input and controls program flow. 
*/

import java.until.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        OrderQueue OrderQueue = new OrderQueue();

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Fast Food System!");

        while (true) {
            System.out.println("\n1. View Menu");
            System.out.println("2. Place Order");
            System.out.println("3. Process Next Order");
            System.out.println("4. Exit");

            int choice = input.nextInt();
        
        if (choice == 1) {
            menu.displayMenu();
        }

        else if (choice == 2) {
                Order order = new Order();

                menu.displayMenu();
                System.out.println("Enter item number (-1 to finish):");

                while (true) {
                    int item = input.nextInt();
                    if (item == -1) break;

                    order.addItem(menu.getItem(item));
                }

                orderQueue.addOrder(order);
                System.out.println("Order added to queue!");
            }

        else if (choice == 3) {
                Receipt receipt = new Receipt();
                receipt.printReceipt(orderQueue.processOrder());
            }

        else if (choice == 4) {
                break;
            }
        }

        input.close();


    }
}