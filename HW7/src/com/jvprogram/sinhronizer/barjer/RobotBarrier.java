package com.jv_program.sinhronizer.barjer;

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