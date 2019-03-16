package com.mateakademia.homework3.lamborghinicar;

public class CarDoor {

    private boolean isDoorOpened;
    private boolean isWindowOpened;

    public CarDoor (boolean isDoorOpened, boolean isWindowOpened) {
        this.isDoorOpened = isDoorOpened;
        this.isWindowOpened = isWindowOpened;
    }

    public CarDoor () {
           }

    public void openDoor(){
        isDoorOpened = true;
    }

    public void closeDoor () {
        isDoorOpened = false ;
    }

    public void setDoor () {
        if (isDoorOpened == false){
            isDoorOpened = true;
        }
        else {isDoorOpened = false;}
    }

    public void openWindow () {
        isWindowOpened = true;
    }

    public void closeWindow () {
        isWindowOpened = false;
    }

    public void setWindow () {
        isWindowOpened = !isWindowOpened;
    }

    public boolean getDoor () {
        return isDoorOpened;
    }

    public boolean getWindow () {
        return isWindowOpened;
    }

    public String rez( boolean abc ){
        String x = abc ? "closed" : "open";
        return  x;
    }

    public void showInfoDoorWindow(){
        System.out.println("Door of the car is " + rez(getDoor()) + "****" + "Window of the car is "  +  rez(getWindow()));

    }
}



