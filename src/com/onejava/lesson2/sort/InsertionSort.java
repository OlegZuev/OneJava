package com.onejava.lesson2.sort;

import java.util.Arrays;
import java.util.Random;

public class InsertionSort {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
        }
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int[] array) {
        if (array.length == 0) {
            return;
        }

        int key;
        for (int i = 1; i < array.length; i++) {
            key = array[i];
            for (int k = i - 1; k >= 0 && key < array[k]; k--) {
                array[k + 1] = array[k];
                array[k] = key;
            }
        }
    }
}
