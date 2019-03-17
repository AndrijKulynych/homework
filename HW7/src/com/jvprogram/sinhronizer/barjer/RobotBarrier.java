package com.jvprogram.sinhronizer.barjer;

public class RobotBarrier extends Thread {
    @Override
    public void run() {
        try {
            sleep(500);
            System.out.println("I working....wait...");
        } catch (InterruptedException e) {
            e.getMessage();
        }
    }
}
