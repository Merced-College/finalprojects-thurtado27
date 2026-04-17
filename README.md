[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=23370803)
# cpsc39-finalProjects

Upload your final project to this github repo.

Make a README file for your project and put the infor about your project in it - your name, date and what your program does.


Trinity Hurtado, 04/16/26 

# Fast Food System

## Description

The Fast Food System is a terminal-based Java application that allows users to view a menu, place orders, and process orders in a queue. It also tracks statistics on how many of each menu item have been ordered.

1. View Menu  
   - The user can view a list of available menu items with their prices.  
   - The menu is stored in an ArrayList<MenuItem> for dynamic management.

2. Place Order 
   - The user selects items from the menu by entering the item number.  
   - Items are added to an Order object, which stores the selected items in an ArrayList.  
   - Once finished, the order is added to the OrderQueue (FIFO queue implemented using LinkedList).

3. Process Next Order
   - The system processes the next order in the queue using the OrderQueue.  
   - A Receipt is generated for the order, showing each item and the total cost.  
   - The total is calculated using a **recursive function** that sums the prices of all items.  
   - The order statistics are updated using a HashMap (OrderStats) to track the total quantity of each item ordered across all processed orders.

4. Order Statistics  
   - After each processed order, the system prints statistics showing how many times each menu item has been ordered.  
   - This demonstrates the use of a hash table to efficiently track and update counts.

5. Exit
   - The user can exit the system at any time, ending the program.

## Features

- Dynamic menu management with ArrayList
- FIFO order processing with Queue
- Recursive calculation of order totals
- Tracking item order statistics using HashMap
- Object-oriented design with reusable classes
- Simple and easy-to-use console interface
- Input validation to prevent invalid entries
