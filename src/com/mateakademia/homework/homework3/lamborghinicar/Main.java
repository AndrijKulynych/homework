package com.mateakademia.homework3.lamborghinicar;


public class Main {
    public static void main (String[] args) {
       CarDoor x= new CarDoor();
    x.setWindow();
        x.showInfoDoorWindow();
        new CarWheel().showInfoWheel();
        System.out.print("\n");
        System.out.println("__CAR PASPORT___");
        new Car().showInfo();

    }
}
