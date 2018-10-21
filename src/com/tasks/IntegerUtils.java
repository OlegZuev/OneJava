package com.tasks;

public class IntegerUtils {
    public int leftShift(int number) {
        return (number << 1) | (number >>> 31);
    }

    public int rightShift(int number) {
        return (number >>> 1) | (number << 31);
    }

    public int swapBits(int number, int i, int j) {
        int a = number & (1 << i);
        int b = number & (1 << j);
        return (a != 0) == (b != 0) ? number : (number ^ (1 << i)) ^ (1 << j);
    }

    public static void main(String[] args) {
        IntegerUtils utils = new IntegerUtils();
        int i = 0b1011_0000;
        System.out.println(String.format("%32s",Integer.toBinaryString(i)));
        System.out.println(String.format("%32s",Integer.toBinaryString(utils.swapBits(i, 0, 6))));
        System.out.println(utils.leftShift(i));
    }
}
