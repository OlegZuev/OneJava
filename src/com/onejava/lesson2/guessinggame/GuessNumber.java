package com.onejava.lesson2.guessinggame;

import java.util.Random;

public class GuessNumber {
	private int guessNumber;

	public int getGuessNumber() {
		return guessNumber;
	}
	public void setGuessNumber() {
		guessNumber = new Random().nextInt(100);
	}

	public boolean guess(int playerNumber) {
		if (guessNumber < playerNumber) {
			System.out.println("���� ����� ������ ������������.");
			return false;
		} else if (guessNumber > playerNumber) {
			System.out.println("���� ����� ������ ������������.");
			return false;
		}
		return true;
	}
}