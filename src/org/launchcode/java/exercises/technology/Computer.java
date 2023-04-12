package org.launchcode.java.exercises.technology;

public class Computer extends AbstractEntity {
    private String manufacturer;

    private int year;
    private int ramGb;
    private int storageGb;

    public Computer(String manufacturer, int year, int ramGb, int storageGb) {
        super();
        this.manufacturer = manufacturer;
        this.year = year;
        this.ramGb = ramGb;
        this.storageGb = storageGb;
     }

    public Computer(String manufacturer, int ramGb, int storageGb) {
        this.manufacturer = manufacturer;
        this.year = 2023;
        this.ramGb = ramGb;
        this.storageGb = storageGb;
    }

    public int getRamGb() {
        return ramGb;
    }

    public int getStorageGb() {
        return storageGb;
    }

    public int getYear() {
        return year;
    }

    public String getManufacturer() {
        return manufacturer;
    }

}
