package com.mateakademia.homework.homework3.task32.lamborghinicar;

public class Car {
    private final int produceDate= 1999;
    private String engineType;
    private int maxSpeed;
    private int accelerTime;
    private int totalPassNumber;
    private int currentPassNumber;
    private int currentSpeed;
    private CarWheel[] carwheels = new CarWheel[MAX_WHEELS];
    private CarDoor[] cardoors = new CarDoor[MAX_DOORS];
    private int wheelCount;
    private static final int MAX_DOORS = 4;
    private static final int MAX_WHEELS = 10;

    public Car (int produceDate) {
        this.engineType = engineType;
        this.maxSpeed = maxSpeed;
        this.accelerTime = accelerTime;
        this.totalPassNumber = totalPassNumber;
    }

    public Car (){
         this.engineType = engineType;
        this.maxSpeed = maxSpeed;
        this.accelerTime = accelerTime;
        this.totalPassNumber = totalPassNumber;
        this.currentPassNumber = currentPassNumber;
        this.currentSpeed = currentSpeed;
        this.setCarDoors();
        this.setCarWheels();
    }

    public void setCurrentSpeed(int currentSpeed){
        if ((currentSpeed <= maxSpeed) && (currentSpeed >= 0)) {
            this.currentSpeed = currentSpeed;
        } else {
            System.out.println("Error. It is out of speed diapason.");
        }
    }

    public int getCurrentSpeed(){
        return currentSpeed;
    }

    public void takeOnePassenger(){

        if (currentPassNumber <= totalPassNumber){
            currentPassNumber++;
        } else {
            System.out.println("Err: Can't put passanger becouse car i full.");
        }
    }

    public int getCurrentPassNumber(){
        return currentPassNumber;
    }

    private boolean checkPassengers(){
        return (currentPassNumber > 0);
    }

    public void getoffOnePassenger(){
        if (checkPassengers()) {
            currentPassNumber--;
        } else {
            System.out.println("Err: Passangers are absent.");
        }
    }

    public void getoffAllPassengers(){
        if (checkPassengers()) {
            currentPassNumber = 0;
        } else {
            System.out.println("Passenges are absend");
        }
    }

    public void setCarDoors(){
        for (int i = 0; i < MAX_DOORS; i++){
            cardoors[i] = new CarDoor();
        }
    }

    public void setCarWheels(){
        wheelCount = 4;
        for (int i=0; i < wheelCount; i++){
            carwheels[i] = new CarWheel();
        }
    }

    public CarDoor getCarDoor(int i){
        if ((i >= 0) && (i <= MAX_DOORS-1)){
            return cardoors[i];
        } else {
            System.out.println("Err: not that door.");
            return null;
        }
    }

    public CarWheel getCarWheel(int i){
        if ((i >= 0) && (i <= wheelCount-1)){
            return carwheels[i];
        } else {
            System.out.println("It is't  wheel ");
            return null;
        }
    }

    public void getOffAllCarWheels(){
        for (CarWheel carwheel: carwheels){
            carwheel = null;
        }
        wheelCount = 0;
    }

    public void setNewWheels(int x){
        if (x + wheelCount > MAX_WHEELS) {
            System.out.println("It's cannot add " + x + " wheels( maxWheels ) " + MAX_WHEELS );
        } else {
            for (int i = 0; i < x; i++){
                carwheels[wheelCount + i] = new CarWheel();
            }
            wheelCount += x;
        }
    }

    public double getCurrentMaxSpeed(double minTWheel){
        if ((currentPassNumber == 0) || (wheelCount == 0)){
            return 0;
        } else {
            return maxSpeed * minTWheel;
        }
    }

    public double getMinTireWheel(){
        double result = carwheels[0].getTireState();
        for (int i = 0; i < wheelCount; i++){
            result = (carwheels[i].getTireState() < result)?carwheels[i].getTireState():result;
        }
        return result;
    }

    public int getCurrentNumberOfWheels(){
        return wheelCount;
    }

    public void showInfo(){
        showInfoShort();
        System.out.println("Current max speed: " + getCurrentMaxSpeed(getMinTireWheel()));
    }

    public void showInfoShort(){
        System.out.println("Date produce: " + produceDate);
        System.out.println("Engine type: " + engineType);
        System.out.println("Max speed new car: " + maxSpeed);
        System.out.println("Time acceleration to 100 mps: " + accelerTime);
        System.out.println("Capacity of passengers: " + totalPassNumber);
        System.out.println("Current speåd " + currentSpeed);
        System.out.println("Current number of wheels: " + wheelCount);
    }
}



