package org.launchcode.java.studios.restaurant;

import java.util.Date;
import java.util.ArrayList;

public class Menu {
    private Date dateUpdated;
    private ArrayList<MenuItem> items;

    private MenuItem mostRecent;

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
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
}
