package com.mateakademija.homework.homework5;
import java.util.Scanner;

public class Start {

    public static void main (String[] args) {
        double n1;
        double n2;
        char op;

        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Please input your first number:");
            n1 = input.nextDouble();

            System.out.println("Please input the second numer:");
            n2 = input.nextDouble();

            System.out.println("Select your operation:");
             op = input.next().charAt(0);

                Double rez = new Calculate().operations.get(op).apply(n1, n2);
                System.out.println(rez);

            }
        }


    }

