/*
Author: Trinity Hurtado
Class: Order.java

Description:
Represents a customer order with multiple MenuItem objects.
Includes recursive total calculation.
*/

import java.util.ArrayList;

public class Order {
    ArrayList<MenuItem> orderItems = new ArrayList<>();

    public void addItem(MenuItem item) {
        if (item != null) {
            orderItems.add(item);
        }
    }

    // Recursive function to calculate total
    public double calculateTotalRecursive() {
        return recursiveTotal(orderItems.size() - 1);
    }

    private double recursiveTotal(int index) {
        if (index < 0) return 0;
        return orderItems.get(index).price + recursiveTotal(index - 1);
    }
}