package com.homework5.tasknew;

import java.util.Scanner;

public class Calculator {
    private static Scanner op;
    private static Scanner input;
    private static Scanner cont;


    public static Function f1 = (a, b, op) -> {
        return  (a + b);
    };
    public static Function f2 = (a, b, op) -> {
        return (a - b);
    };
    public static Function f3 = (a, b, op) -> {
        return (a * b);
    };
    public static Function f4 = (a, b, op) -> {
        return (a / b);
    };
    public static Function f5 = (a, b, op) -> {
        return  Math.pow(a, b);
    };
    public static Function f6 = (a, b, op) -> {
        return  Math.pow(a, (1 / b));
    };
    public static Function f7 = (a, b, op) -> {
        return  Math.pow((a + b) / (a + 117), a);
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


            System.out.print(operation.equals("+") == true ? "Your result <+> operation is: " + f1.calculate(num1, num2, "+") : "");

            System.out.print(operation.equals("-") == true ? "Your result <-> operation is: " + f2.calculate(num1, num2, "-") : "");

            System.out.print(operation.equals("*") == true ? "Your result <*> operation is: " + f3.calculate(num1, num2, "*") : "");

            System.out.print(operation.equals("/") == true ? "Your result </> operation is: " + f4.calculate(num1, num2, "/") : "");

            System.out.print(operation.equals("^") == true ? "Your result <^> operation is: " + f5.calculate(num1, num2, "^") : "");

            System.out.print(operation.equals("root") == true ? "Your result <root> operation is: " + f6.calculate(num1, num2, "root") : "");

            System.out.print(operation.equals("^r") == true ? "Your result <^r> operation is : " + f7.calculate(num1, num2, "^r") : "");


            System.out.println("\n" + " Do you wish to perform any other operation?");

            cont = new Scanner(System.in);

            operation = cont.next();

            rez.println(operation);
        }
    }
}

