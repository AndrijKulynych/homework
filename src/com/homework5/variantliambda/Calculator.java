package com.homework5.variantliambda;

import com.homework5.firstvariant.Function3Arity;

import java.util.Scanner;

public class Calculator {
    private static Scanner op;
    private static Scanner input;
    private static Scanner cont;



    private static  Function f1 = (a, op, b) -> { return "" + a + op + b + "=" + (a + b);};
    private static Function  f2 = (a, op, b) -> { return "" + a + op + b + "=" + (a - b);};
    private static  Function  f3 = (a, op, b) -> { return "" + a + op + b + "=" + (a * b);};


    public static void main (String[] args) {

        double num1;
        double num2;
        double ans = 0;

        String operation;
        while (true) {
            input = new Scanner(System.in);
            System.out.println("Please input your first number:");
            num1 = input.nextDouble();

            System.out.println("Please input the second numer:");
            num2 = input.nextDouble();

            op = new Scanner(System.in);
            System.out.println("Select your operation:");
            operation = op.next();


            if (operation.equals("+")) {
                System.out.println("Your Result is:" + f1.apply(num1, operation, num2));
            }

            if (operation.equals("-")) {
                System.out.println("Your result is:" + (num1 - num2));
            }

            if (operation.equals("*")) {
                System.out.println("Your result is:" + (num1 * num2));
            }
            if (operation.equals("/")) {
                System.out.println("Your result is:" + (num1 / num2));
            }
            if (operation.equals("^")) {
                ans = Math.pow(num1, num2);
                System.out.println("Your result is:" + ans);
            }

            if (operation.equals("root")) {
                System.out.println("Your result is:" + Math.pow( num1, (1 / num2)));
            }

            if (operation.equals("^r")) {
                ans = Math.pow((num1+num2)/(num1+117), num1);
                System.out.println("Your result is:" + ans);
            }



            System.out.println("Do you wish to perform any other operation?");

            cont = new Scanner(System.in);

            operation = cont.next();


            if (operation.equals("Y")) {

            } else {
                System.out.println("Thank You");
                System.exit(0);
            }
        }
    }
}