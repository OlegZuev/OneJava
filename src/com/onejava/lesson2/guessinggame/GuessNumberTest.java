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
 * @version 1.2.1
 */

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Player pl1 = new Player();
        Player pl2 = new Player();
        boolean result;
        boolean winnerFirst = false;
        boolean winnerSecond = false;
        GuessNumber guessN = new GuessNumber();
        System.out.print("Первый игрок, введите имя: ");
        pl1.setName(sc.nextLine());
        System.out.print("Второй игрок, введите имя: ");
        pl2.setName(sc.nextLine());
        System.out.println("У вас 10 попыток.");

        while (true) {
            guessN.setGuessNumber();
            result = false;

            while (!result && pl1.getI() != 9) {
                System.out.print(pl1.getName() + ", введите число: ");
                pl1.setPlayerNumber(sc.nextInt());
                result = guessN.guess(pl1.getPlayerNumber());

                if (result) {
                    winnerFirst = true;
                    break;
                }

                System.out.print(pl2.getName() + ", введите число: ");
                pl2.setPlayerNumber(sc.nextInt());
                result = guessN.guess(pl2.getPlayerNumber());

                if (result) {
                    winnerSecond = true;
                }
            }

            System.out.print("Числа игрока " + pl1.getName() + ": ");
            for (int k = 0; k <= pl1.getI(); k++) {
                System.out.print(pl1.getPlayerNumber(k) + " ");
            }

            System.out.print("\n" + "Числа игрока " + pl2.getName() + ": ");
            for (int k = 0; k <= pl2.getI(); k++) {
                System.out.print(pl2.getPlayerNumber(k) + " ");
            }

            if (winnerFirst) {
                System.out.print("\n" +"Игрок " + pl1.getName() + " угадал число " + guessN.getGuessNumber() + " с " +
                                   (pl1.getI() + 1) + " попытки." + "\n" +
                                   "Хотите продолжить? [да/нет]: ");
            } else if (winnerSecond) {
                System.out.print("\n" +"Игрок " + pl2.getName() + " угадал число " + guessN.getGuessNumber() + " с " +
                                   (pl2.getI() + 1) + " попытки." + "\n" +
                                   "Хотите продолжить? [да/нет]: ");
            } else {
                System.out.print("\n" + pl1.getName() + " и " + pl2.getName() + ", у вас закончились попытки." + "\n" +
                                   "Хотите продолжить? [да/нет]: ");
            }

            if (sc.next().equals("нет")) {
                break;
            }
            pl1.reset();
            pl2.reset();
            winnerFirst = false;
            winnerSecond = false;
        }
    }
}