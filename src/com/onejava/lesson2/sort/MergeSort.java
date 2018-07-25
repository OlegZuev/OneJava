package com.onejava.lesson2.sort;

import java.util.Arrays;
import java.util.Random;

public class MergeSort {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] array) {
        mergeSort(array, 0, array.length - 1);
    }

    public static void mergeSort(int[] array, int start, int end) {
        if (array.length == 0 || start >= end) {
            return;
        }

        int pivot = start + (end - start) / 2;
        mergeSort(array, start, pivot);
        mergeSort(array, pivot + 1, end);

        int[] buffer = Arrays.copyOf(array, array.length);
        int i = start;
        int j = pivot + 1;
        int currentPosition = start;
        while (currentPosition <= end) {
            if (i > pivot) {
                array[currentPosition++] = buffer[j++];
            } else if (j > end) {
                array[currentPosition++] = buffer[i++];
            } else {
                array[currentPosition++] = buffer[i] < buffer[j] ? buffer[i++] : buffer[j++];
            }
        }
    }
}
