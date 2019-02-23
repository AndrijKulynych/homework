package com.mate_akademia_homework.homework1.task15;


import java.util.stream.IntStream;

public class QuickSort {

    public static void main(String[] args) {

     int[] numbers = IntStream.generate(() -> (int) (Math.random()*(25331111+100000))-200000).limit(1000000).toArray();
     int n = numbers.length;

        System.out.println("Длина массива: " + numbers.length);
        System.out.println("1-й ел-т массива до сортир-ки " + numbers[0]);
        System.out.println("1000000-й ел-т массива до сорт-ки " + numbers[numbers.length-1]);
     long startTime = System.currentTimeMillis();//время старт
     quicksort(numbers, 0, n-1);
     long spendTime = System.currentTimeMillis()-startTime;// время потрачено

        for (int h = 0; h < numbers.length; h++)
            System.out.println(numbers[h]+ " ");

        System.out.println("Длина массива: " + numbers.length);
        System.out.println("1-й ел-т массива после сорт-ки " + numbers[0]);
        System.out.println("1000000-й ел-т массива после сорт-ки " + numbers[numbers.length-1]);
        System.out.println(" ");
        System.out.println("Время сортировки:  " + spendTime);
}

    // Quick sort algorithm
    public static void quicksort(int[] numbers, int low, int high) {
        if (low < high) {
            int dp = partition(numbers, low, high);
            quicksort(numbers, low, dp-1);
            quicksort(numbers, dp+1, high);
        }
    }


    // partition numbers[low] to numbers[high] using numbers[low] as the pivot
    private static int partition(int[] numbers, int low, int high) {
        int pivot = numbers[low];
        int i = low;
        for (int j = low + 1; j <= high; j++)
            if (numbers[j] < pivot) {
                ++i;
                swap(numbers, i, j);
            }
        //end for
        swap(numbers, low, i);
        return i;
    }

    // Exchange list[i] and list[j] values
    private static void swap(int[] list, int i, int j) {
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }
}


