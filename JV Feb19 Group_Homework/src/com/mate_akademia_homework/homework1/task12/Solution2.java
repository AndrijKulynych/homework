package com.mate_akademia_homework.homework1.task12;


public class Solution2 {


    public static void main (String[] args) {

       rombDraw(11,11);
    }

        public static void rombDraw(int x, int y){

        for (int i = 0; i < x; i++) {

            for (int j = 0; j < y; j++) {

                if (j == y / 2 - i || j == y / 2 + i || j == i - y / 2 || j == x - i + x / 2 - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
        System.out.println();
    }

}