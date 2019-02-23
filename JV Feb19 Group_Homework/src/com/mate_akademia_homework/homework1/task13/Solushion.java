/**
 *Возвести число в квадрат, куб, степень
 */

package com.mate_akademia_homework.homework1.task13;


import java.util.Scanner;

public class Solushion {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Введите  число :  ");
        int n1 = (int) sc.nextDouble();

        System.out.println("Спасибо, вы ввели число :" + n1);

        System.out.println(" Введите   степень возведения числа :  ");

        int n2 = (int) sc.nextDouble();

        System.out.println("-----------------");
        System.out.println("Квадрат числа " + n1 +  "равен :" + Math.pow(n1,2.0)  );
        System.out.println("Куб числа " + n1 +  "равен :" + Math.pow(n1,3.0)  );
        System.out.println(" Число " + n1 + " в степени " + n2 + " равено: " + Math.pow(n1,n2)  );



    }

}