
package com.jv_program.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class CountThread extends Thread {
    private AtomicInteger count;

    public CountThread(AtomicInteger count, String name) {
        super.setName(name);
        this.count = count;
    }

    @Override
    public void run() {
        System.out.println( " << " + super.getName()+ " = " + count.getAndIncrement() +" >>");
    }
}

