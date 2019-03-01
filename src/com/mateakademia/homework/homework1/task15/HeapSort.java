package com.mateakademia.homework.homework1.task15;


import java.util.stream.IntStream;

public class HeapSort {
    private static int tmp;
    public static void main(String[] args) {
        int[] numbers = IntStream.generate(() -> (int) (Math.random()*(25331111+100000))-200000).limit(1000000).toArray();
        System.out.println("Array length: " + numbers.length);
        System.out.println("1-st element of array  before sort : "  + numbers[0]);
        System.out.println("Last element of array  before sort : " + numbers[numbers.length-1]);
        long startTime = System.currentTimeMillis();
        heapsort(numbers);
        long spendTime = System.currentTimeMillis()-startTime;
        for (int h = 0; h < numbers.length; h++) {
            System.out.println(numbers[h] + " ");
        }
        System.out.println("Array length: " + numbers.length);
        System.out.println("1-st element of array  after sort : " + numbers[0]);
        System.out.println("Last element of array  after sort : " + numbers[numbers.length-1]);
        System.out.println(" ");
        System.out.println(" Spend time for sorting: " + spendTime);
    }

    public static void heapsort(int[] a) {
        for (int i = a.length / 2 - 1; i >= 0; i--) {
              shiftDown(a, i, a.length);
        }
        for (int i = a.length - 1; i > 0; i--) {
            swap(a, 0, i);
            shiftDown(a, 0, i);
        }
    }

    private static void shiftDown(int[] a, int i, int n) {
        int child;
        for (tmp = a[i]; leftChild(i) < n; i = child) {
            child = leftChild(i);
            if (child != n - 1 && (a[child] < a[child + 1])) {
                child++;
            }
            if (tmp < a[child]) {
                a[i] = a[child];
            }
            else {
                break;
            }
        }
        a[i] = tmp;
    }

    private static int leftChild (int i) {
        return 2 * i + 1;
    }

    public static void swap (int[] numbers, int i, int j) {
        tmp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = tmp;
    }
}