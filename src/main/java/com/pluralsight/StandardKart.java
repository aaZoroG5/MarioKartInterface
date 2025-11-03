package com.pluralsight;

public class StandardKart extends Kart {

    private int reliability;

    public StandardKart (String name, double basePrice, int reliability) {
        super(name, basePrice);
        this.reliability = reliability;
    }

    @Override
    public double getValue(){
        //arbitrary way to calculate the value for this kart
        return this.getBasePrice() + (reliability * 10);
    }
}
