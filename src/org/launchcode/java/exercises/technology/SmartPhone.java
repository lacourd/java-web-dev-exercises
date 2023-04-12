package org.launchcode.java.exercises.technology;

public class SmartPhone extends Computer {

    private String model;
    private String operatingSystem;
    private String network;
    public SmartPhone(String manufacturer, String model, String operatingSystem, String network, int year, int ramGb, int storageGb) {
        super(manufacturer, year, ramGb, storageGb);
        this.model = model;
        this.operatingSystem = operatingSystem;
        this.network = network;

    }

    public SmartPhone(String manufacturer, String model, String operatingSystem, String network, int ramGb, int storageGb) {
        super(manufacturer, ramGb, storageGb);
        this.model = model;
        this.operatingSystem = operatingSystem;
        this.network = network;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

}
