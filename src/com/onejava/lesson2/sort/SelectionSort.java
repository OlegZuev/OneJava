package com.onejava.lesson2.sort;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
        }
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] array) {
        if (array.length == 0) {
            return;
        }

        int min;
        int temp;
        for (int i = 0; i < array.length; i++) {
            min = array[i];
            for (int k = i; k < array.length; k++) {
                if (array[k] < array[min]) {
                    min = k;
                }
            }
            if (array[min] < array[i]) {
                temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }
    }
}
