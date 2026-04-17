/*
Author: Trinity Hurtado
Class: OrderStats.java

Description:
Tracks the total quantity of each menu item ordered using a HashMap.
*/

import java.util.HashMap;

public class OrderStats {
    private HashMap<String, Integer> stats = new HashMap<>();

    public void addOrder(Order order) {
        for (MenuItem item : order.orderItems) {
            stats.put(item.name, stats.getOrDefault(item.name, 0) + 1);
        }
    }

    public void printStats() {
        System.out.println("\n--- ORDER STATISTICS ---");
        for (String itemName : stats.keySet()) {
            System.out.println(itemName + ": " + stats.get(itemName));
        }
    }
}