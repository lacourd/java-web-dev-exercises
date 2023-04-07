package org.launchcode.java.studios.restaurant;


import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;

import static java.text.DateFormat.MEDIUM;
import static java.text.DateFormat.getDateInstance;

public class Menu {
    private String dateUpdated;
    private ArrayList<MenuItem> items;

    private MenuItem mostRecent;

    public Menu() {
        Date today = new Date();
        this.items = new ArrayList<MenuItem>();
        this.dateUpdated = DateFormat.getDateInstance(MEDIUM).format(today);
    }

    public String getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated() {
        Date now = new Date();
        this.dateUpdated =  DateFormat.getDateInstance(MEDIUM).format(now);
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public MenuItem getMostRecent() {
        return mostRecent;
    }

    public void setMostRecent(MenuItem mostRecent) {
        this.mostRecent = mostRecent;
    }

    public void addItem(MenuItem item) {
        for (MenuItem menuItem : this.items) {
            if (menuItem.equals(item)) {
                System.out.println("Item already on menu; not added");
                return;
            }
        }
            items.add(item);
            setDateUpdated();
    }

    public void removeItem(MenuItem item) {
        items.remove(item);
    }
    public void printMenu() {
        System.out.println("Menu updated on " + this.getDateUpdated() + "\n");
        for (MenuItem menuItems : this.items) {
            menuItems.printItem();
            System.out.println("\n*****\n");
        }
    }
}
