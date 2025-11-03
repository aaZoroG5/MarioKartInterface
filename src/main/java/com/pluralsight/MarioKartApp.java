package com.pluralsight;

public class MarioKartApp {

    public static void main(String[] args) {

        //make a garage object
        Garage myGarage = new Garage();

        //lets create 2 carts
        StandardKart newStandardKart = new StandardKart ("Toad Kart", 100, 8);
        JetKart fastJetKart = new JetKart("FastJetKart", 1000, 10);
        CoinPile theCoinPile = new CoinPile(1500);

        //add all the values to the garage
        myGarage.add(newStandardKart);
        myGarage.add(fastJetKart);
        myGarage.add(theCoinPile);


    }
}
