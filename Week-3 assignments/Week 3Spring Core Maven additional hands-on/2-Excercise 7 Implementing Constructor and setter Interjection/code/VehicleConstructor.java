package com.example.demo;

public class VehicleConstructor {
    private String name;
    private int speed;

    public VehicleConstructor(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public void showDetails() {
        System.out.println("Constructor Injection - Vehicle: " + name + ", Speed: " + speed);
    }
}