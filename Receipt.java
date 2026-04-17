/*
Author: Trinity Hurtado
Class: Receipt.java

Description:
Prints the receipt for a processed order.
*/

public class Receipt {

    public void printReceipt(Order order) {
        if (order == null) return;

        System.out.println("\n--- RECEIPT ---");
        System.out.println("Items: " + order.orderItems.size());
        System.out.println("TOTAL: $" + order.getTotal());
        System.out.println("---------------\n");
    }
}