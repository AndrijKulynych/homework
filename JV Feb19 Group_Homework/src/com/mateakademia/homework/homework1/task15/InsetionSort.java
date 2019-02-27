package com.mateakademia.homework.homework1.task15;


import java.util.stream.IntStream;

public class InsetionSort {

    public static void main (String[] args) {
        int[] numbers = IntStream.generate(() -> (int) (Math.random()*(25331111+100000))-200000).limit(1000000).toArray();
        int n = numbers.length;
        System.out.println("Array length: " + numbers.length);
        System.out.println("1-st element of array  before sort : "  + numbers[0]);
        System.out.println("Last element of array  before sort : " + numbers[numbers.length-1]);
        long startTime = System.currentTimeMillis();
        insertionSort(numbers);
        long spendTime = System.currentTimeMillis()-startTime;
        for (int h = 0; h < n; h++) {
            System.out.println(numbers[h] + " ");
        }
        System.out.println("Array length: " + numbers.length);
        System.out.println("1-st element of array  after sort : " + numbers[0]);
        System.out.println("Last element of array  after sort : " + numbers[numbers.length-1]);
        System.out.println(" ");
        System.out.println(" Spend time for sorting: " + spendTime);
    }

        public static void insertionSort(int[] elements) {
            for (int i = 1; i < elements.length; i++) {
                int key = elements[i];
                int j = i - 1;
                while (j >= 0 && key < elements[j]) {
                    elements[j + 1] = elements[j];
                    j--;
                }
                elements[j + 1] = key;
            }
        }
    }

