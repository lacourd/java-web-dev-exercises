package org.launchcode.java.exercises.technology;

public class Laptop extends Computer {

    private String model;
    private String operatingSystem;
    public Laptop(String manufacturer, String model, String operatingSystem, int year, int ramGb, int storageGb) {
        super(manufacturer, year, ramGb, storageGb);
        this.model = model;
        this.operatingSystem = operatingSystem;
    }


}
