package com.jvprogram.concurrent.collections;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteApp {
    private static List <String> list = new CopyOnWriteArrayList <>();
    public static void main (String[] args) {
        list.add("AAAAAA");
        list.add("BBBBBB");
        list.add("CCCCCC");
        new Thread(new Runnable() {
            @Override
            public void run () {
                Iterator <String> itrList = list.iterator();
                while (itrList.hasNext()) {
                    String str = itrList.next();
                    System.out.println("Thread  1:" + str);
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run () {
                list.add("CCCCCC");
                Iterator <String> itrList = list.iterator();
                while (itrList.hasNext()) {
                    String str = itrList.next();
                    System.out.println("Thread  2:" + str);
                }
            }
        }).start();
    }
}
