/*
Author: Trinity Hurtado
Class: OrderQueue.java

Description:
Manages customer orders using a Queue (FIFO system).
*/

import java.util.LinkedList;
import java.util.Queue;

public class OrderQueue {

    // Data Structure: Queue using LinkedList
    Queue<Order> orders = new LinkedList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    /*
    Algorithm: Queue Processing (FIFO)

    Removes and returns the first order in the queue.

    Time Complexity: O(1)
    */
    public Order processOrder() {
        if (orders.isEmpty()) {
            System.out.println("No orders in queue.");
            return null;
        }
        return orders.poll();
    }
}