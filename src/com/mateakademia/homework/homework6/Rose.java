package com.mateakademia.homework6;

public class Rose extends Flower {

    private static final int ROSE_PRICE = 100;

    public Rose(){
        super(ROSE_PRICE);
    }

    @Override
    public String toString() {
        return ("Rose");
    }

}