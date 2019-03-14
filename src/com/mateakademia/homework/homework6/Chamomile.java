package com.mateakademia.homework6;
public class Chamomile extends Flower {
       private static int CHAMBORLIN_PRICE = 70;

    public Chamomile(){
        super(CHAMBORLIN_PRICE);
    }

    @Override
    public String toString() {
        return ("Chamomile");
    }

}