package com.mateakademija.homework.homework4.task42;


import java.util.LinkedList;

public class Test {

    public static void main (String[] args) {
        MyLinkedList <String> linkList = new MyLinkedList <>();
        linkList.add(0, "ssss");
        linkList.add(1, "11111");
        linkList.add(2, "ssss");
        linkList.add(3, "ssss");
        linkList.add(4, "ssss");
        linkList.add("нннннн");
        linkList.remove(1);

        //linkList.clear();
        System.out.println( "Size of array  -" + linkList.size()+"\n ");
        for (int  x =0;x< linkList.size();x++){
            System.out.println("element - " + linkList.get(x));}
    }

}
