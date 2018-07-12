package com.onejava.lesson2.guessinggame;

import java.util.Random;

public class GuessNumber {
    private int guessNumber;
    private boolean result;
    private int stop;

    public void setGuessNumber() {
        guessNumber = new Random().nextInt(100);
        result = false;
    }

    public boolean isResult() {
        return result;
    }

    public void guess(Player pl) {
        if (pl.getI() == 9) {
            stop++;

            if (stop == 2) {
                result = true;
            }
        }

        if (guessNumber < pl.getPlayerNumber()) {
            System.out.println("Ваше число больше угадываемого.");
        } else if (guessNumber > pl.getPlayerNumber()) {
            System.out.println("Ваше число меньше угадываемого.");
        } else {
            result = true;
            pl.setWinner(true);
        }
    }

    public void result(Player pl1, Player pl2) {
        if (pl1.isWinner()) {
            System.out.println("Игрок " + pl1.getName() + " угадал число " + guessNumber + " с " +
                            (pl1.getI() + 1) + " попытки.");
        } else if (pl2.isWinner()) {
            System.out.println("Игрок " + pl2.getName() + " угадал число " + guessNumber + " с " +
                    (pl2.getI() + 1) + " попытки.");
        } else {
            System.out.println(pl1.getName() + " и " + pl2.getName() + ", у вас закончились попытки.");
        }
    }
}