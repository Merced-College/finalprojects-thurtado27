/*
Author: Trinity Hurtado
Class: Receipt.java

Description:
Prints out a receipt for a processed order.
*/

public class Receipt {
    public void printReceipt(Order order) {
        System.out.println("\n--- RECEIPT ---");
        for (MenuItem item : order.orderItems) {
            System.out.println(item.name + " - $" + item.price);
        }
        System.out.printf("Total: $%.2f\n", order.calculateTotalRecursive());
    }
}