package com.mateakademia.homework.homework2.task24;

import java.util.Date;

public class ImmutableExample {

    public static void main (String[] args) {
        Car car1 = new Car("Volvo","XC-90",2.0,320, new Date());
        String m1 = car1.getMarka();
        String model1 = car1.getModel();
        double runV = car1.getRunVolume();
        int runPower1 = car1.getRunPower();
        Date date1 = car1.dateProduce;
        m1 = "BMW";
        model1 = "X6";
        runV = 4.4;
        runPower1 = 407;
        date1.setTime(0);
        System.out.println("We create car " + car1.getMarka() + " model: " +car1.getModel());
        System.out.println("engine capacity: " + car1.getRunVolume() + "engine power: " + car1.getRunPower());
        System.out.println("date produce: " + car1.getDate_produce());
    }

    static final class Car{
        private String marka;
        private String model;
        private double runVolume;
        private int runPower;
        private Date dateProduce;

        public String getMarka () {
            return marka;
        }

        public String getModel () {
            return model;
        }

        public double getRunVolume () {
            return runVolume;
        }

        public int getRunPower () {
            return runPower;
        }

        public Date getDate_produce () {
             return (Date) dateProduce.clone();
        }

        public Car (String marka, String model, double runVolume, int runPower, Date dateProduce) {
            this.marka = marka;
            this.model = model;
            this.runVolume = runVolume;
            this.runPower = runPower;
            this.dateProduce = dateProduce;
        }
    }
    }


