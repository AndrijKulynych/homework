/**
 *Возвести число в квадрат, куб, степень
 */

package com.mateakademija.homework1.task13;


import java.util.Scanner;

public class Solushion {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Please, enter your number:  ");
        int n1 = (int) sc.nextDouble();
        System.out.println(" Thanks, now enter degree:  ");
        int n2 = (int) sc.nextDouble();
        System.out.println("");
        System.out.println("Your results : ");
        System.out.println("(" +n1 + ") ^ 2" +" = " + power(n1,2));
        System.out.println("(" +n1 + ") ^ 3" +" = " + power(n1,3));
        //System.out.println("Entering number " + n1 + " in degree " + n2 + " = " + power(n1, n2));
        System.out.println("(" +n1 + ") ^ " + n2 +" = " + power(n1,3));
    }

    private static int power (int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result = result * a;
        }
        return result;
    }
}