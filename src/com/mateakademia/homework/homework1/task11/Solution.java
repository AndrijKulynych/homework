package com.mateakademia.homework.homework1.task11;

import java.util.Scanner;

public class Solution {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("You must enter 4 numbers. Enter the first number: ");
        int n1 = sc.nextInt();
        System.out.println("Thank! Now enter the 2nd number: ");
        int n2 = sc.nextInt();
        System.out.println("Thank! Now enter the 3nd number: ");
        int n3 = sc.nextInt();
        System.out.println("Thank!  enter the 4th number:");
        int n4 = sc.nextInt();
        sc.close();
        StringBuffer buf = new StringBuffer();
        buf.append("**********************************" + "\n");
        buf.append("YOUR RESULT of football betting:  " + "<< " + matchResult(n1, n2, n3, n4) + " >>" + "\n");
        System.out.print(buf.toString());
        buf.setLength(0);
    }

    private static int matchResult (int a, int b, int c, int d) {
        int rez1 = (a > b) ? 1 : 0;
        int rez2 = (c > d) ? 1 : 0;
        int rez3 = (rez1 == rez2) ? 1 : 0;
        return  ((a == c) && (b == d)) ? 2 : rez3;
    }
}
