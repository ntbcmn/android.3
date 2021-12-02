package com.company;

public class Storage {
    int size;
    String model;

    public Storage(int size, String model) {
        this.size = size;
        this.model = model;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSize() {
        return size;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        String m = "Storage`s size: " + getSize() + " " + "\n" +
                "Storage`s model: " + getModel() + " " + "\n";
        return m;
    }
}
