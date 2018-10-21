package com.tasks;

public class IntegerUtils {
    public int leftShift(int i) {
        return (i << 1) | (i >>> 31);
    }

    public int rightShift(int i) {
        return (i >>> 1) | (i << 31);
    }

    public static void main(String[] args) {
        IntegerUtils utils = new IntegerUtils();
        int i = 2050136832;
        System.out.println(String.format("%32s",Integer.toBinaryString(i)));
        System.out.println(String.format("%32s",Integer.toBinaryString(utils.rightShift(i))));
        System.out.println(utils.leftShift(i));
    }
}
