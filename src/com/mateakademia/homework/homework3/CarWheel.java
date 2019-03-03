package com.mateakademia.homework.homework3.task32.lamborghinicar;

    public class CarWheel {

        private static final double TIRE_OLD = 0.0;
        private static final double TIRE_NEW = 1.0;
        private double tireTag;

        public CarWheel(){
            tireTag = 1.0;
        }

        public CarWheel(double tireTag){
            if (checkTire(tireTag)){
                this.tireTag = tireTag;
            } else {
                System.out.println("It's cann't  create CarWheel");
            }
        }

        // method  check  value inside of [0,1]
        private boolean checkTire (double tireTag) {
            boolean result = ((tireTag >= TIRE_OLD) && (tireTag <= TIRE_NEW));
            if (!result) {
                System.out.println(" Wrong number tire wear, diapason is [0,1].");
            }
            return result;
        }

          public void setTire(){
            tireTag = TIRE_NEW;
        }

        public void wearTire(double x){
           if ((x >= 0) && (x <= 100)){
                tireTag *= (1 - (x / 100));
           } else {
                System.out.println("Err,  [0,100]");
            }
        }

        public double getTireState(){
            return tireTag;
        }

        public void showInfoWheel(){
            System.out.println("(X%)The state of tire is - " + getTireState() );
        }

    }

