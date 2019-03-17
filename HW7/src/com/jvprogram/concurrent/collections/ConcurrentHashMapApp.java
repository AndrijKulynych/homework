package com.jvprogram.concurrent.collections;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapApp {
    private static  String NUMBER_1 = "FIRST";
    private static  String NUMBER_2 = "SECOND";
    private static  String NUMBER_3 = "THIRD";
    private  static final ConcurrentHashMap <Integer, String> hash = new ConcurrentHashMap <>();

    public static void main (String[] args) {
        new Thread(new FirstThread()).start();
        new Thread(new SecondThread()).start();
        new Thread(new ThirdThread()).start();
        new Thread(new ForthThread()).start();
    }

  private static class FirstThread implements Runnable {
        @Override
        public void run () {
            for (int i = 1; i <= 10; i++) {
                hash.put(i, NUMBER_1);
            }
        }
    }

    private static class SecondThread implements Runnable {
        @Override
        public void run () {
            for (int i = 1; i <= 10; i++) {
                hash.put(i, NUMBER_2);
            }
        }
    }

    private static class ThirdThread implements Runnable {
        @Override
        public void run () {
            for (int i = 1; i <= 10; i++) {
                hash.put(i, NUMBER_3);
            }
        }
    }

    private static class ForthThread implements Runnable {
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
