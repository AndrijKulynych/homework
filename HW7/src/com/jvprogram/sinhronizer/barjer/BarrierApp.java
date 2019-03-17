package com.jvprogram.sinhronizer.barjer;

import java.util.concurrent.CyclicBarrier;

public class BarrierApp {
    public static void main (String[] args) throws InterruptedException {
        CyclicBarrier barrier = new CyclicBarrier(3, new RobotBarrier());
        for (int i = 0; i < 12; i++) {
            new Thread(new Robot(i, barrier)).start();
            Thread.sleep(600);
        }
    }
}
