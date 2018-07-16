package com.onejava.lesson2.guessinggame;

import java.util.Scanner;

/**
 * Модифицируйте программу Угадай число, используя для хранения, названных игроками чисел, массивы:
 * перед началом игры выведите сообщение: У вас 10 попыток
 * по окончанию игры отобразите, в две строки через пробел, все названные игроками числа
 * если массив полностью не заполнен, т.е. пользователь угадал число менее чем за 10 попыток, то выводить весь массив не нужно
 * в конце игры выведите сообщение "Игрок " + имя + " угадал число " + число + " с " + номер + " попытки"
 * если игроки не угадали число за 10 попыток, то отобразите сообщение: "У " + имя + " закончились попытки"
 *
 * @version 1.4
 */

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Первый игрок, введите имя: ");
        Player pl1 = new Player(sc.nextLine());
        System.out.print("Второй игрок, введите имя: ");
        Player pl2 = new Player(sc.nextLine());
        GuessNumber guessN = new GuessNumber(pl1, pl2);
        System.out.println("У вас 10 попыток.");

        while (true) {
            guessN.start();
            System.out.print("Хотите продолжить? [да/нет]: ");
            String temp = sc.next();
            while (!(temp.equals("нет") || temp.equals("да"))) {
                System.out.print("Вы ввели некорректный ответ. Поробуйте ещё раз [да/нет]: ");
                temp = sc.next();
            }
            if (temp.equals("нет")) {
                break;
            }
        }
    }
}