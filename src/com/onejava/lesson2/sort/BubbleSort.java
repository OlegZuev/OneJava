package com.onejava.lesson2.sort;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
        }
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr){
        int temp;
        for (int i = arr.length - 1; i > 0; i--) {
            for (int k = 0; k < i; k++) {
                if (arr[k] > arr[k + 1]) {
                    temp = arr[k];
                    arr[k] = arr[k + 1];
                    arr[k + 1] = temp;
                }
            }
        }
    }
}
