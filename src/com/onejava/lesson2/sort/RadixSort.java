package com.onejava.lesson2.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class RadixSort {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
        }
        radixSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void radixSort(int[] array) {
        if (array.length == 0) {
            return;
        }

        ArrayList<Integer>[] buckets = new ArrayList[10];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<Integer>();
        }

        boolean isAllDigitsAreSorted = false;
        int temp = 0;
        int divisor = 1;
        while (!isAllDigitsAreSorted) {
            isAllDigitsAreSorted = true;
            for (int i = 0; i < array.length; i++) {
                temp = array[i] / divisor;
                buckets[temp % 10].add(array[i]);
                if (isAllDigitsAreSorted && temp > 0) {
                    isAllDigitsAreSorted = false;
                }
            }

            int k = 0;
            for (int i = 0; i < buckets.length; i++) {
                for (Integer j : buckets[i]) {
                    array[k++] = j;
                }
                buckets[i].clear();
            }
            divisor *= 10;
        }
    }
}
