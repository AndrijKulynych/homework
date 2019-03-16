package com.mateakademia.homework6;


public class Tulip extends Flower {

    private static final int TULIP_PRICE = 45;

    public Tulip(){
        super(TULIP_PRICE);
    }

    @Override
    public String toString() {
        return ("Tulip");
    }

}