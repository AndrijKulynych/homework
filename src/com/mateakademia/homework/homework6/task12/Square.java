package com.mateakademija.homework6.task12;

public class Square {
    private double side;

    public double getSide () {
        return side;
    }

    public void setSide (double side) throws PerimetrException {
        if (side <= 0) {
            throw new PerimetrException("Err: Choose correct side please...");
        }
        this.side = side;
    }
}
