package org.launchcode.java.studios.restaurant;

public class Restaurant {

    public static void main(String[] args) {

        MenuItem eggs = new MenuItem("Eggs", "Main Course", "Two eggs prepared as you choose, along with bacon and toast", 8.99);
//        eggs.printItem();
        MenuItem burger = new MenuItem("Bacon and Swiss Burger", "Main Course", "Two patties with swiss cheese and four slices of bacon", 14.99);
        MenuItem calamari = new MenuItem("Calamari", "Appetizer", "Fried calamari served with tartar sauce and ketchup", 12.99);
        MenuItem cheesecake = new MenuItem("Coconut Cream Pie Cheesecake", "Dessert", "Delicious cheesecake with toasted coconut", 6.99, true);
        Menu testMenu = new Menu();
        testMenu.addItem(eggs);
        testMenu.addItem(burger);
        testMenu.addItem(calamari);
        testMenu.addItem(cheesecake);
        testMenu.printMenu();
        testMenu.removeItem(burger);
        System.out.println("Sold of out burgers!\n");
        testMenu.printMenu();
    }
}
