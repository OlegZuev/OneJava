package com.onejava.lesson2.sort;

import java.util.Arrays;
import java.util.Random;

public class RandomQuickSort {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
        }
        randomQuickSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void randomQuickSort(int[] array) {
        randomQuickSort(array, 0, array.length - 1);
    }

    public static void randomQuickSort(int[] array, int start, int end) {
        if (array.length == 0 || start >= end) {
            return;
        }

        Random r = new Random();
        int i = start;
        int j = end;
        int pivot = r.nextInt(j - i) + i;
        int temp;
        while (i < j) {
            while (array[i] <= array[pivot] && i < pivot) {
                i++;
            }

            while (array[j] >= array[pivot] && j > pivot) {
                j--;
            }

            if (i < j) {
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                if (pivot == i) {
                    pivot = j;
                } else if (pivot == j) {
                    pivot = i;
                }
            }
        }
        randomQuickSort(array, start, pivot);
        randomQuickSort(array, pivot + 1, end);
    }
}
