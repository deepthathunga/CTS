package com.example.demo;

public class VehicleSetter {
    private String name;
    private int speed;

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void showDetails() {
        System.out.println("Setter Injection - Vehicle: " + name + ", Speed: " + speed);
    }
}