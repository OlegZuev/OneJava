package com.onejava.lesson2.guessinggame;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private int guessNumber;
    private boolean winnerExist;
    private Player pl1;
    private Player pl2;
    private Scanner sc = new Scanner(System.in);

    public void start() {
        guessNumber = new Random().nextInt(100);
        while (!winnerExist) { //Процесс угадывания с проверкой наличия победителя
            guess(pl1);
            guess(pl2);
            if (!pl1.isAttempts() && !pl2.isAttempts()) {
                break;
            }
        }
        showNumbers(pl1);
        showNumbers(pl2);
        if (pl1.isWinner()) {
            result(pl1);
        }
        if (pl2.isWinner()) {
            result(pl2);
        }
        if (!winnerExist) {
            result();
        }
        reset();
        repeat();
    }

    private void guess(Player pl) {
        if (pl.isAttempts()) {
            inputPlayerNumber(pl);
            int tempPlayerNumber = pl.getPlayerNumber();
            if (guessNumber < tempPlayerNumber) {
                System.out.println("Ваше число больше угадываемого.");
            } else if (guessNumber > tempPlayerNumber) {
                System.out.println("Ваше число меньше угадываемого.");
            } else {
                winnerExist = true;
                pl.setWinner(true);
            }
        }
    }

    private void result() {
        System.out.println("У игроков кончились попытки.");
    }

    private void result(Player pl) {
        System.out.println("Игрок " + pl.getName() + " угадал число " + guessNumber + " с " +
                (pl.getCounter() + 1) + " попытки.");
    }

    private void showNumbers(Player pl) {
        System.out.print("Числа игрока " + pl.getName() + ": ");
        for (int k = 0; k <= pl.getCounter(); k++) {
            System.out.print(pl.getPlayerNumber(k) + " ");
        }
        System.out.println();
    }

    private void inputPlayerNumber(Player pl) {
        System.out.print(pl.getName() + ", введите число: ");
        pl.setPlayerNumber(sc.nextInt());
    }

    private void reset() {
        winnerExist = false;
        pl1.reset();
        pl2.reset();
    }
    public void initialize() {
        System.out.print("Первый игрок, введите имя: ");
        pl1 = new Player(sc.nextLine());
        System.out.print("Второй игрок, введите имя: ");
        pl2 = new Player(sc.nextLine());
        System.out.println("У вас 10 попыток.");
    }

    private void repeat() {
        System.out.print("Хотите продолжить? [да/нет]: ");
        String temp = sc.next();
        while (!(temp.equals("нет") || temp.equals("да"))) {
            System.out.print("Вы ввели некорректный ответ. Поробуйте ещё раз [да/нет]: ");
            temp = sc.next();
        }
        if (temp.equals("да")) {
            start();
        }
    }
}