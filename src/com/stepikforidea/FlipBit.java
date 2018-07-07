package com.stepikforidea;

/**
 * Реализуйте метод flipBit, изменяющий значение одного бита заданного целого числа на противоположное.
 * Данная задача актуальна, например, при работе с битовыми полями.
 * Договоримся, что биты нумеруются от младшего (индекс 1) к старшему (индекс 32).
 * Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода добавит проверяющая система.
 *
 * Sample Input:
 * 0 1
 *
 * Sample Output:
 * 1
 */

public class FlipBit {
    public static void main(String[] args) {
        System.out.println("Test1: " + (flipBit(0, 1) == 1)); //Result should be is: 1
        System.out.println("Test2: " + (flipBit(Integer.MAX_VALUE, 5) == 2147483631)); //Result should be is: 2147483631
        System.out.println("Test3: " + (flipBit(Integer.MIN_VALUE, 15) == -2147467264)); //Result should be is: -2147467264
        System.out.println("Test4: " + (flipBit(1010101, 31) == 1074751925)); //Result should be is: 1074751925
        System.out.println("Test5: " + (flipBit(298528214, 2) == 298528212)); //Result should be is: 298528212
        System.out.println("Test6: " + (flipBit(920588142, 4) == 920588134)); //Result should be is: 920588134
        System.out.println("Test7: " + (flipBit(725921954, 6) == 725921922)); //Result should be is: 725921922
        System.out.println("Test8: " + (flipBit(258718425, 8) == 258718297)); //Result should be is: 258718297
        System.out.println("Test9: " + (flipBit(39266271, 10) == 39265759)); //Result should be is: 39265759
        System.out.println("Test10: " + (flipBit(6320352, 12) == 6322400)); //Result should be is: 6322400
        System.out.println("Test11: " + (flipBit(417883, 14) == 409691)); //Result should be is: 409691
        System.out.println("Test12: " + (flipBit(3933551, 16) == 3966319)); //Result should be is: 3966319
        System.out.println("Test13: " + (flipBit(6875731, 18) == 7006803)); //Result should be is: 7006803
        System.out.println("Test14: " + (flipBit(2752877, 20) == 2228589)); //Result should be is: 2228589
        System.out.println("Test15: " + (flipBit(2152, 25) == 16779368)); //Result should be is: 16779368
    }

    /**
     * Flips one bit of the given <code>value</code>.
     *
     * @param value     any number
     * @param bitIndex  index of the bit to flip, 1 <= bitIndex <= 32
     * @return new value with one bit flipped
     */
    public static int flipBit(int value, int bitIndex) {
        return 1; // put your implementation here
    }
}
