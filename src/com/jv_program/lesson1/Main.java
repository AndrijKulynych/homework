package com.jv_program.lesson1;

import java.util.HashMap;
import java.util.function.BinaryOperator;

public class Main {

    public static void main (String[] args) {
        double n1 = 30;
        double n2 = 40;


        HashMap <Character, BinaryOperator <Double>> operations = new HashMap <>();
        {
            {
                {
                    operations.put('+', (x, y) -> x + y);
                    operations.put('-', (x, y) -> x - y);
                    operations.put('*', (x, y) -> x * y);
                    operations.put('/', (x, y) -> x / y);
                    operations.put('^', (x, y) -> Math.pow(x, y));
                    operations.put('R', (x, y) -> Math.pow(x, (1 / y)));
                    operations.put('S', (x, y) -> Math.pow((x + y) / (x + 117), x));
                }
            }


            System.out.println(operations.get('+').apply(n1, n2));
            System.out.println(operations.get('-').apply(n1, n2));
            System.out.println(operations.get('*').apply(n1, n2));
            System.out.println(operations.get('^').apply(n1, n2));
            System.out.println(operations.get('R').apply(n1, n2));
            System.out.println(operations.get('S').apply(n1, n2));


        }
    }


}

