package com.onejava.debugger;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] result = Merger.merge(new int[]{}, new int[]{1});

        if (!Arrays.equals(result, new int[]{1})) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }
}
