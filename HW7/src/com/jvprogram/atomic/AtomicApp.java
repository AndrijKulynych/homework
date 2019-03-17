package com.jvprogram.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicApp {

    public static void main (String[] args) {
        AtomicInteger count = new AtomicInteger(0);
        new Thread(new CountThread(count, "1st thread")).start();
        new Thread(new CountThread(count, "2nd thread")).start();
        new Thread(new CountThread(count, "3d thread")).start();
    }
}