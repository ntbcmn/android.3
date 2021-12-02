package com.company;

public class Hard {
    double size;
    double speed;

    public Hard(int size, int speed) {
        this.size = size;
        this.speed = speed;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getSize() {
        return size;
    }

    public double getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        String message = "Hard`s size: " + this.size + " " + "\n" +
                "Hard`s speed: " + this.speed + " " + "\n";
        return message;
    }
}

