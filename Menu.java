/*
Author: Trinity Hurtado
Class: Menu.java

Description:
Represents the restaurant menu with an ArrayList of MenuItem objects.
*/

import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuItem> items = new ArrayList<>();

    public Menu() {
        items.add(new MenuItem("Burger", 5.99));
        items.add(new MenuItem("Fries", 2.99));
        items.add(new MenuItem("Soda", 1.50));
        items.add(new MenuItem("Salad", 3.99));
    }

    public void displayMenu() {
        System.out.println("\n--- MENU ---");
        for (int i = 0; i < items.size(); i++) {
            System.out.println(i + ". " + items.get(i).name + " - $" + items.get(i).price);
        }
    }

    public MenuItem getItem(int index) {
        if (index >= 0 && index < items.size()) {
            return items.get(index);
        }
        System.out.println("Invalid item number!");
        return null;
    }
}
