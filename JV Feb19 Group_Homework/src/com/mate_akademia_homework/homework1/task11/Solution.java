package com.mate_akademia_homework.homework1.task11;


import java.util.Scanner;

/*******************************
 * 1.1 С помощью тернарного оператора написать функцию, которая будет считать исход матча.
 * Метод будет принимать 4 параметра и возвращать целое число. Футбольный матч.
 * 4 параметра метода - результат матча и то, что поставил пользователь.
 *
 *  Пример: 0,2,1,1. Что значит: команды сыграли в счёт 0:2, а пользователь ставил 1:1.
 *  Задача: если пользователь угадал 100% результат - возвращать 2, если угадал, что
 *   выиграла какая-либо команда (пр. сыграли 1:2, а ставил 0:3 - то пользователь у выиграше),
 *    то возвращать 1, если не угадал ничего - возвращать 0.
 *
 */
public class Solution {
    public static void main (String[] args) {


            Scanner sc = new Scanner(System.in);
            System.out.println("Нужно ввести 4 числа. Введите первое число :");

            int n1 = sc.nextInt();

            System.out.println("Спасибо! Теперь 2-е введите  :");

        int n2 = sc.nextInt();

        System.out.println("Спасибо! Теперь 3-е введите :");
        int n3 = sc.nextInt();

        System.out.println("Спасибо! Теперь 4-е введите :");
        int n4 = sc.nextInt();

            sc.close();
        StringBuffer buf = new StringBuffer();
        buf.append("**********************************" + "\n");
        buf.append("Результат футбольного тотализатора :  " + "<< " + football_match(n1,n2,n3,n4) +  " >>" + "\n");

        System.out.print(buf.toString());
        buf.setLength(0);
    }


    public static int football_match(int a,int b,int c, int d){


        int rez;
            int win = 2;

            int rez1 = (a > b)? 1: 0;
            int rez2 = (c > d)? 1: 0;
            int rez3;
            rez3 = (rez1 ==  rez2)? 1 : 0 ;
            rez = ((a == c)&&(b == d)) ? 2 : rez3 ;

    return rez;
        }
    }
