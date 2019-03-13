package com.mateakademija.homework6.task11;

import java.util.Arrays;
import java.util.List;

/**
 * Mу java program  WildcardDemo to demonstrate Upper Bounded Wildcards
 *
 * @author  Andrij Kulynych *
 */
class WildcardDemo{

    public static void main(String[] args){
        List<Integer> list1= Arrays.asList(10,11,12,13);
        System.out.println("Total sum of array1 is: "+sum(list1));
        List<Double> list2=Arrays.asList(10.1,11.1,12.1,13.1);
        System.out.println("Total sum of array2 is: "+sum(list2));
    }

    private static double sum(List<? extends Number> list)
    {
        double sum=0.0;
        for (Number x: list)
        {
            sum+=x.doubleValue();
        }

        return sum;
    }
}
