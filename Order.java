/*
Author: Trinity Hurtado
Class: Order.java

Description:
Stores items selected by the user and calculates total cost.
*/

import java.util.ArrayList;

public class Order {

    // Data Structure: ArrayList to store items in an order
    ArrayList<MenuItem> orderItems = new ArrayList<>();

    public void addItem(MenuItem item) {
        orderItems.add(item);
    }

    /*
    Algorithm: Total Cost Calculation

    Loops through all items and adds their prices together.

    Time Complexity: O(n)
    */
    public double getTotal() {
        double total = 0;

        for (MenuItem item : orderItems) {
            total += item.price;
        }

        return total;
    }
}