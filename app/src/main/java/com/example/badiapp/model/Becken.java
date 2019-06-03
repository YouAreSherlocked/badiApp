package com.example.badiapp.model;

public class Becken {
    private String name;
    private double temperature;

    public Becken(String name, double temp) {
        this.name = name;
        this.temperature = temp;
    }

    public String getName() {
        return name;
    }

    public double getTemperature() {
        return temperature;
    }

    public void changeTemperature(double temp) {
        this.temperature = temp;
    }

    public void changeName(String name) {
        this.name = name;
    }
}
