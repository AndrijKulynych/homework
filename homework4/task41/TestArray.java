package com.mateakademija.homework.homework4.task41;

public class TestArray {

    public static void main(String[] args) {
        MyArrayList<String> srt = new MyArrayList <>();
        srt.add(0,"11111");
        srt.add(1,"s2");
        srt.add(2,"ss3");
        srt.add(3,"sss4");
        srt.add(4,"ssss");
        srt.add("VVVVVVV");
       srt.remove(0);
       //srt.clear();
        System.out.println("\n " + "Size of ListArray:-"+ srt.size());
        for(String x: srt){ System.out.println("element - "+x);}
       // System.out.println(srt.get(2));

    }
}
