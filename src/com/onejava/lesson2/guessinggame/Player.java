package com.onejava.lesson2.guessinggame;

public class Player {
    private int[] playerNumber = new int[10];
    private int i = -1;
    private String name;
    private boolean winner;

    public int getPlayerNumber() {
        return playerNumber[i];
    }

    public int getPlayerNumber(int k) {
        return playerNumber[k];
    }

    public void setPlayerNumber(int playerNumber) {
        i++;
        this.playerNumber[i] = playerNumber;
    }

    public int getI() {
        return i;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isWinner() {
        return winner;
    }

    public void setWinner(boolean winner) {
        this.winner = winner;
    }

    public void reset() {
        playerNumber = new int[10];
        i = -1;
        winner = false;
    }

    public void showNumbers() {
        System.out.print("Числа игрока " + name + ": ");
        for (int k = 0; k <= i; k++) {
            System.out.print(playerNumber[k] + " ");
        }
        System.out.println();
    }
}