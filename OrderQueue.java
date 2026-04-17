/*
Author: Trinity Hurtado
Class: OrderQueue.java

Description:
Manages the queue of customer orders using LinkedList.
*/

import java.util.LinkedList;
import java.util.Queue;

public class OrderQueue {
    private Queue<Order> orders = new LinkedList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public Order processOrder() {
        return orders.poll(); // removes first order (FIFO)
    }

    public boolean isEmpty() {
        return orders.isEmpty();
    }
}