package com.mateakademia.homework6;

public abstract class Flowers {
    private int price;

    public Flowers(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public abstract String toString();

}