package com.mate_akademia_homework.homework1.task15;


import java.util.stream.IntStream;

public class HeapSort {

    private static int tmp;

    public static void main(String[] args) {
        int tmp ;
        int[] numbers = IntStream.generate(() -> (int) (Math.random()*(25331111+100000))-200000).limit(1000000).toArray();
        //int[] numbers = {10,1,23,2,6,7,3,14};
        int n = numbers.length;

        System.out.println("Длина массива: " + numbers.length);
        System.out.println("1-й ел-т массива до сортир-ки " + numbers[0]);
        System.out.println("1000000-й ел-т массива до сорт-ки " + numbers[numbers.length-1]);
        long startTime = System.currentTimeMillis();//время старт
        heapsort(numbers);
        long spendTime = System.currentTimeMillis()-startTime;// время потрачено

        for (int h = 0; h < numbers.length; h++)
            System.out.println(numbers[h]+ " ");

        System.out.println("Длина массива: " + numbers.length);
        System.out.println("1-й ел-т массива после сорт-ки " + numbers[0]);
        System.out.println("1000000-й ел-т массива после сорт-ки " + numbers[numbers.length-1]);
        System.out.println(" ");
        System.out.println("Время сортировки:  " + spendTime);
    }

    // sort num[1] to num[n]
    public static void heapsort(int[] a) {
        for (int i = a.length / 2 - 1; i >= 0; i--) {
            // convert the array to a heap
            shiftDown(a, i, a.length);
        }
        for (int i = a.length - 1; i > 0; i--) {
            swap(a, 0, i); /* deleteMax */
            shiftDown(a, 0, i);
        }
    } // end heapSort

    private static void shiftDown(int[] a, int i, int n) {
        int child;


        for (tmp = a[i]; leftChild(i) < n; i = child) {
            child = leftChild(i);
            if (child != n - 1 && (a[child] < a[child + 1]))
                child++;
            if (tmp < a[child])
                a[i] = a[child];
            else
                break;
        }
        a[i] = tmp;
    }

    private static int leftChild(int i) {
        return 2 * i + 1;
    }

    // swap numbers
    public static void swap(int[] numbers, int i, int j) {
        tmp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = tmp;
    }

}