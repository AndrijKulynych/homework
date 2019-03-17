package com.jvprogram.singeltonreflecs;

import java.lang.reflect.Constructor;

public class Application {

    public static void main (String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run () {
                Singleton inst1 = Singleton.getInstance();
                System.out.println("INSTANCE 1:  " + inst1.hashCode());
            }
        }).start();
        new Thread(new Runnable() {
            public void run () {
                Singleton inst2 = Singleton.getInstance();
                System.out.println("INSTANCE 2 :  " + inst2.hashCode());
            }
        }).start();
        Singleton inst3 = Singleton.getInstance();
        Singleton inst4 = null;
        try {
            Class <? extends Singleton> clazz = Singleton.class;
            Constructor <Singleton> bilder = (Constructor <Singleton>) clazz.getDeclaredConstructor();
            bilder.setAccessible(true);
            inst4 = bilder.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("INSTANCE 3 :  " + inst3.hashCode());
        System.out.println("INSTANCE 4 :  " + inst4.hashCode());
    }
}
