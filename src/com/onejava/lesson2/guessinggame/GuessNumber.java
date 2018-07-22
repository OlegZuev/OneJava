package com.onejava.lesson2.guessinggame;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private int guessNumber;
    private boolean winnerExist;
    private Player pl1;
    private Player pl2;
    private Scanner sc = new Scanner(System.in);

    public GuessNumber(Player pl1, Player pl2) {
        this.pl1 = pl1;
        this.pl2 = pl2;
    }

    public void start() {
        guessNumber = new Random().nextInt(100);
        System.out.println(guessNumber);
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
    }

    public void guess(Player pl) {
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

    public void result() {
        System.out.println("У игроков кончились попытки.");
    }

    public void result(Player pl) {
        System.out.println("Игрок " + pl.getName() + " угадал число " + guessNumber + " с " +
                (pl.getCounter() + 1) + " попытки.");
    }

    public void showNumbers(Player pl) {
        System.out.print("Числа игрока " + pl.getName() + ": ");
        for (int k = 0; k <= pl.getCounter(); k++) {
            System.out.print(pl.getPlayerNumber(k) + " ");
        }
        System.out.println();
    }

    public void inputPlayerNumber(Player pl) {
        System.out.print(pl.getName() + ", введите число: ");
        pl.setPlayerNumber(sc.nextInt());
    }

    public void reset() {
        winnerExist = false;
        pl1.reset();
        pl2.reset();
    }
}