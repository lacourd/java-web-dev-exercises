package org.launchcode.java.studios.restaurant;

import java.util.ArrayList;
import java.util.Date;

public class MenuItem {
    private String name;
    private String category;
    private String description;
    private double price;
    private boolean isNew;
//    private boolean isAvailable;
//    private boolean isVegan;
//    private Date dateAdded;

//    private int spiceLevel;
//    private ArrayList<String> dietaryRestrictions;

    public MenuItem(String name, String category, String description, double price, boolean isNew) {
        this.name = name;
        this.category = category;
        this.description = description;
        this.price = price;
        this.isNew = true;
    }
    public MenuItem(String name, String category, String description, double price) {
        this.name = name;
        this.category = category;
        this.description = description;
        this.price = price;
        this.isNew = false;
    }
    public MenuItem(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.description = "Description coming soon!";
        this.price = price;
        this.isNew = false;
    }


    public String getName() {
        return "Name: " + this.name;
    }
    public String getCategory() {
        return "Category: " + this.category;
    }

    public String getDescription() {
        return "Description: " + this.description;
    }
    public String getPrice() {
        return "Price: $"+this.price;
    }

//    public Date getDateAdded() {
//        return this.dateAdded;
//    }

//    public int getSpiceLevel() {
//        return this.spiceLevel;
//    }

//    public ArrayList<String> getDietaryRestrictions() {
//        return this.dietaryRestrictions;
//    }
//  I don't think we need to use getters for the boolean fields, but I could be wrong?
//    public boolean getIsAvailable() {
//        return this.isAvailable;
//    }
//    public boolean getIsNew() {
//        return this.isNew;
//    }
//
//    public boolean getIsVegan() {
//        return this.isVegan;
//    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDescription(String description) {
        this.description = description;
    }

//    public void setDateAdded(Date dateAdded) {
//        this.dateAdded = dateAdded;
//    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }
    public void setPrice(double price) {
        this.price = price;
    }
//
//    public void setAvailable(boolean available) {
//        isAvailable = available;
//    }
//
//    public void setVegan(boolean vegan) {
//        isVegan = vegan;
//    }
//
//    public void setSpiceLevel(int spiceLevel) {
//        this.spiceLevel = spiceLevel;
//    }
//
//    public void setDietaryRestrictions(ArrayList<String> dietaryRestrictions) {
//        this.dietaryRestrictions = dietaryRestrictions;
//    }
    public void printItem() {
        if (this.isNew) {
            System.out.println(this.getName() + " *NEW ITEM* \n" + this.getCategory() +"\n" + this.getDescription() +"\n" + this.getPrice());
        } else {
            System.out.println(this.getName() + "\n" + this.getCategory() + "\n" + this.getDescription() + "\n" + this.getPrice());
        }
    }
}
