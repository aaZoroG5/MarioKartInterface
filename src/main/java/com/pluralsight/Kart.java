package com.pluralsight;

public abstract class Kart implements Valuable{
    //create some proerties that describe our kart
    private String name;
    private double basePrice;

    public Kart(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

}
