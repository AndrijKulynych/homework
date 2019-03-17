package com.jv_program.singeltonreflecs;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Application {

    public static void main (String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run () {
                AppSingleTon inst1 = AppSingleTon.getInstance();
                System.out.println("INSTANCE 1:  " + inst1.hashCode());
            }
        }).start();

        new Thread(new Runnable() {

            public void run () {
                AppSingleTon inst2 = AppSingleTon.getInstance();
                System.out.println("INSTANCE 2 :  " + inst2.hashCode());
            }
        }).start();

        AppSingleTon inst3 = AppSingleTon.getInstance();
        AppSingleTon inst4 = null;
        try {
            Class <? extends AppSingleTon> clazz = AppSingleTon.class;
            Constructor <AppSingleTon> bilder = (Constructor <AppSingleTon>) clazz.getDeclaredConstructor();
            bilder.setAccessible(true);
            inst4 = bilder.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("INSTANCE 3 :  " + inst3.hashCode());
        System.out.println("INSTANCE 4 :  " + inst4.hashCode());
    }
}


















