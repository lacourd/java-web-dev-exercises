package org.launchcode.java.studios.restaurant;

import java.util.ArrayList;
import java.util.Date;

public class MenuItem {
    private String name;
    private String category;
    private String description;
    private double price;
    private boolean isNew;
    private boolean isAvailable;
    private boolean isVegan;
    private Date dateAdded;

    private int spiceLevel;
    private ArrayList<String> dietaryRestrictions;

    public String getName() {
        return this.name;
    }
    public String getCategory() {
        return this.category;
    }

    public String getDescription() {
        return this.description;
    }
    public double getPrice() {
        return this.price;
    }

    public Date getDateAdded() {
        return this.dateAdded;
    }

    public int getSpiceLevel() {
        return this.spiceLevel;
    }

    public ArrayList<String> getDietaryRestrictions() {
        return this.dietaryRestrictions;
    }
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

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void setVegan(boolean vegan) {
        isVegan = vegan;
    }

    public void setSpiceLevel(int spiceLevel) {
        this.spiceLevel = spiceLevel;
    }

    public void setDietaryRestrictions(ArrayList<String> dietaryRestrictions) {
        this.dietaryRestrictions = dietaryRestrictions;
    }
}
