package com.jvprogram.concurrent.collections;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;


public class ConcurrentHashMapApp {
    private final ConcurrentHashMap <Integer, String> hash = new ConcurrentHashMap <>();

    public static void main (String[] args) {
        ConcurrentHashMapApp ob = new ConcurrentHashMapApp();
        new Thread(ob.new FirstThread()).start();
        new Thread(ob.new SecondThread()).start();
        new Thread(ob.new ThirdThread()).start();
        new Thread(ob.new ForthThread()).start();
    }

    class FirstThread implements Runnable {
        @Override
        public void run () {
            for (int i = 1; i <= 10; i++) {
                hash.put(i, "FIRST");
            }
        }
    }

    class SecondThread implements Runnable {
        @Override
        public void run () {
            for (int i = 1; i <= 10; i++) {
                hash.put(i, "SECOND");
            }
        }
    }

    class ThirdThread implements Runnable {
        @Override
        public void run () {
            for (int i = 1; i <= 10; i++) {
                hash.put(i, "Third");
            }
        }
    }

    class ForthThread implements Runnable {
        @Override
        public void run () {
            Iterator <Integer> ite = hash.keySet().iterator();
            while (ite.hasNext()) {
                Integer key = ite.next();
                System.out.println(key + "<< " + hash.get(key) + " >>");
            }
        }
    }
}
