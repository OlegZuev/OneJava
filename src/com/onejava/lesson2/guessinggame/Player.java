package com.onejava.lesson2.guessinggame;

public class Player {
    private int[] playerNumber = new int[10];
    private int counter = -1;
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public boolean isAttempts() {
        return counter < 9;
    }

    public int getPlayerNumber() {
        return playerNumber[counter];
    }

    public int getPlayerNumber(int i) {
        return playerNumber[i];
    }

    public void setPlayerNumber(int playerNumber) {
        counter++;
        this.playerNumber[counter] = playerNumber;
    }

    public int getCounter() {
        return counter;
    }

    public String getName() {
        return name;
    }

    public void reset() {
        playerNumber = new int[10];
        counter = -1;
    }
}