package com.onejava.lesson2.guessinggame;

public class Player {
    private int[] playerNumber = new int[10];
    private int i = -1;
    private String name;

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

    public void reset() {
        playerNumber = new int[10];
        i = -1;
    }
}