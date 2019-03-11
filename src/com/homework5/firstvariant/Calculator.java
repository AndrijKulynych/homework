package com.homework5.firstvariant;

import java.util.Scanner;

public class Calculator {
    private static Scanner op;
    private static Scanner input;
    private static Scanner cont;


    public static Function3Arity f1 = (a, b, op) -> {
        return "" + a + op + b + " = " + (a + b);
    };
    public static Function3Arity f2 = (a, b, op) -> {
        return "" + a + op + b + " = " + (a - b);
    };
    public static Function3Arity f3 = (a, b, op) -> {
        return "" + a + op + b + " = " + (a * b);
    };
    public static Function3Arity f4 = (a, b, op) -> {
        return "" + a + op + b + " = " + (a / b);
    };
    public static Function3Arity f5 = (a, b, op) -> {
        return "" + a + op + b + " = " + Math.pow(a, b);
    };
    public static Function3Arity f6 = (a, b, op) -> {
        return "" + a + op + b + " = " + Math.pow(a, (1 / b));
    };
    public static Function3Arity f7 = (a, b, op) -> {
        return "" + a + op + b + " = " + Math.pow((a + b) / (a + 117), a);
    };
    public static Print rez = (o) -> {
        if (o.equals("Y") == true) {
        } else {
            System.exit(0);
            System.out.println("Thank You");
        }
    };

    public static void main (String[] args) {

        double num1;
        double num2;

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


            System.out.print(operation.equals("+") == true ? "Your result is: " + f1.apply(num1, num2, "+") : "");

            System.out.print(operation.equals("-") == true ? "Your result is: " + f2.apply(num1, num2, "-") : "");

            System.out.print(operation.equals("*") == true ? "Your result is: " + f3.apply(num1, num2, "*") : "");

            System.out.print(operation.equals("/") == true ? "Your result is: " + f4.apply(num1, num2, "/") : "");

            System.out.print(operation.equals("^") == true ? "Your result is: " + f5.apply(num1, num2, "^") : "");

            System.out.print(operation.equals("root") == true ? "Your result is: " + f6.apply(num1, num2, "root") : "");

            System.out.print(operation.equals("^r") == true ? "Your result is: " + f7.apply(num1, num2, "^r") : "");


            System.out.println("\n" + " Do you wish to perform any other operation?");

            cont = new Scanner(System.in);

            operation = cont.next();

            rez.println(operation);
        }
    }
}

