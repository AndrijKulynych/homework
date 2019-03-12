package com.jv_program.lesson1;

import java.util.HashMap;
import java.util.function.BinaryOperator;


public class Calculate {

    static  HashMap <Character, BinaryOperator <Double>> operations = new HashMap <>();

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
    }
}
