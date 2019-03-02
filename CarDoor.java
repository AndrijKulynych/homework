package com.mateakademia.homework.homework3.task32.lamborghinicar;

public class CarDoor {

    private boolean IsDoorOpened;
    private boolean IsWindowOpened;

    CarDoor(){
      IsDoorOpened = false;
      IsWindowOpened = false;
    }

    public CarDoor (boolean isDoorOpened, boolean isWindowOpened) {
        IsDoorOpened = isDoorOpened;
        IsWindowOpened = isWindowOpened;
    }

    public void openDoor(){
        IsDoorOpened = true;
    }

    public void closeDoor () {
        IsDoorOpened = false;
    }

    public void setDoor () {
        IsDoorOpened = !IsDoorOpened;
    }

    public void openWindow () {
        IsWindowOpened = true;
    }

    public void closeWindow () {
        IsWindowOpened = false;
    }

    public void setWindow () {
        IsWindowOpened = !IsWindowOpened;
    }

    public boolean getDoor () {
        return IsDoorOpened;
    }

    public boolean getWindow () {
        return IsWindowOpened;
    }


        public void showInfo(){
            System.out.println("The car door  is " + ((getDoor()?"opened":"closed")));
            System.out.println("The car window  is " + ((getWindow()?"opened":"closed")));
        }


}



