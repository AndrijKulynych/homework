package com.mateakademia.homework.homework1.task14;

import java.util.Scanner;

public class Solution {
    public static void main (String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter number to calculate function Factorial(number):");
        int n1 = sc.nextInt();
        System.out.println("Now enter  number  of the  Fibonacci element: ");
        int n2 = sc.nextInt();
        System.out.println( "****************************************");
        System.out.println( " Your result  of factorial calculation:  !( " + n1 + " )"  + "  =   " + factorial(n1));
        System.out.println(" ");
        System.out.println( " In  Fibonacci sequence "  + n2 + "-th corresponds to : " + GetFibo(n2));
    }

    public static int factorial (int n) {

        return n == 1 ? 1 : n * factorial(n - 1);
    }

    public static int GetFibo (int n) {
        if (n > 1) {
            return GetFibo(n - 2) + GetFibo(n - 1);
        }
        else if (n == 1) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
