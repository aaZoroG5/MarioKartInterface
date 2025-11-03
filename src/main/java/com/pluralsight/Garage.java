package com.pluralsight;

import java.util.ArrayList;

public class Garage {

    private ArrayList<Valuable> valuablesInTheGarage;

    public Garage(ArrayList<Valuable> valuablesInTheGarage) {
        this.valuablesInTheGarage = valuablesInTheGarage;
    }

    public void add(Valuable theValuableToAdd){
        valuablesInTheGarage.add(theValuableToAdd);
    }

    public double getTotalOfGarageValuabes(){
        //start our total as 0
        double total = 0;

        for(Valuable theCurrentValuable : valuablesInTheGarage){
            total += theCurrentValuable.getValue();
        }
        return total;
    }
}
