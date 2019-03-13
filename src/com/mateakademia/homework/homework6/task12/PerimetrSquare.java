package com.mateakademia.homework6.task12;

public class PerimetrSquare {

    public double getPerimetr (double n) {

        Square squre = new Square();

        try {
            squre.setSide(n);
        } catch (PerimetrException e) {
            throw new RuntimeException(e);
        }
        return n * n;
    }

}