package com.company;

public class Laptop {
    int speed;
    String model;
    double capacity;
    Hard hard;
    Storage storage;
    OS os;
    Processor processor;

    public Laptop(int speed, String model, double capacity, Hard hard, Storage storage, OS os, Processor processor) {
        this.speed = speed;
        this.model = model;
        this.capacity = capacity;
        this.hard = hard;
        this.storage = storage;
        this.os = os;
        this.processor = processor;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public int getSpeed() {
        return speed;
    }

    public String getModel() {
        return model;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setHard(Hard hard) {
        this.hard = hard;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public void setOs(OS os) {
        this.os = os;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Hard getHard() {
        return hard;
    }

    public Storage getStorage() {
        return storage;
    }

    public OS getOs() {
        return os;
    }

    public Processor getProcessor() {
        return processor;
    }


    @Override
    public String toString() {
        String mess = "Laptop`s speed: " + this.speed + "mb/s" + " " + "\n" +
                "Laptop`s type: " + this.model + " " + "\n" +
                "Laptop`s capacity: " + this.capacity + "gb" + " " + "\n" + this.hard + " " + "\n" +
                this.storage + " " + "\n" + this.os + " " + "\n" + this.processor;
        return mess;
    }

}
