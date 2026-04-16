/*
Author: Trinity Hurtado
Class: Menu.java

Description:
Stores and manages all menu items using an ArrayList.
Provides methods to display and retrieve menu items.
*/

import java.util.ArrayList;

public class Menu {

    // Data Structure: ArrayList to store menu items
    ArrayList<MenuItem> items = new ArrayList<>();

    public Menu() {
        items.add(new MenuItem("Burger", 5.99));
        items.add(new MenuItem("Fries", 2.99));
        items.add(new MenuItem("Drink", 1.99));
        items.add(new MenuItem("Nuggets", 6.49));
    }

    public void displayMenu() {
        for (int i = 0; i < items.size(); i++) {
            System.out.println(i + ": " + items.get(i).name + " - $" + items.get(i).price);
        }
    }

    /*
    Algorithm: Menu Item Retrieval (Search)

    This method retrieves an item based on its index.
    The user selects an index, and the program returns that item.

    Time Complexity: O(1)
    */
    public MenuItem getItem(int index) {
        return items.get(index);
    }
}

