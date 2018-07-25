package com.onejava.lesson2.sort;

import java.util.Arrays;
import java.util.Random;

public class CountingSort {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
        }
        countingSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void countingSort(int[] array) {
        if(array.length == 0) {
            return;
        }

        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            } else if (array[i] > max) {
                max = array[i];
            }
        }

        int range = max - min + 1;
        int[] count = new int[range];
        for (int i = 0; i < array.length; i++) {
            count[array[i] - min]++;
        }
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        for (int i = 0, k = 0; i < range; i++) {
            while (k < count[i]) {
                array[k++] = i + min;
            }
        }
    }
}
