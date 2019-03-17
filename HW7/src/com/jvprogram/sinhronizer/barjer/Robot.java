package com.jv_program.sinhronizer.barjer;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Robot extends Thread {
    private int id;
    private CyclicBarrier cyclBarrier;

    public Robot (int id, CyclicBarrier cyclBarrier) {
        this.id = id;
        this.cyclBarrier = cyclBarrier;
    }

    @Override
    public void run () {
        try {
            System.out.println("Robot: " + id + " finished his work.");
            cyclBarrier.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}