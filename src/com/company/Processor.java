package com.company;

public class Processor {
    String model;
    double core;
    double frequency;

    public Processor(String model, double core, double frequency) {
        this.model = model;
        this.core = core;
        this.frequency = frequency;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCore(double core) {
        this.core = core;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public String getModel() {
        return model;
    }

    public double getCore() {
        return core;
    }

    public double getFrequency() {
        return frequency;
    }
    @Override
    public String toString() {
             String ik =    "Processor`s model: " + getModel() + " " + "\n" +
                        "Processor`s core: " + getCore() + " " + "\n" +
                        "Processor`s frequency: " + getFrequency() + " " + "\n";
        return ik;
    }
}
