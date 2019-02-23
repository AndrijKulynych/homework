package com.mate_akademia_homework.homework1.task14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {

    public static void main (String[] args)  {
       // int num  = 10;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Введите  число для вычисления Факториал(число): ");
        int n1 = sc.nextInt();
        System.out.println("Спасибо! Теперь введите число(номер елементя ряда Фибоначчи : ");
        int n2 = sc.nextInt();

        System.out.println( " Результат вычисления факториала:  !( " + n1 + " )"  + "  =   " + factorial(n1));
        System.out.println(" ");
        System.out.println( " В последовательности чисел Фибоначчи "  + n2 +" -й  елемент  равен:  " + GetFibo(n2));
    }

            // вычисление факториала числа n
           public static int factorial(int n) {
                if (n==1)
                    return 1;
                else
                    return n*factorial(n-1);
        }

    // Определение n-го числа Фибоначчи
    public static int GetFibo(int n) {
        if (n > 1)
            return GetFibo(n - 2) + GetFibo(n - 1);
        else if (n == 1)
            return 1;
        else
            return 0; // если n==0
    }

}
