package com.onejava.lesson2.guessinggame;

import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		Player pl1 = new Player();
		Player pl2 = new Player();
		boolean result;
		GuessNumber guessN = new GuessNumber();

		while (true) {
			guessN.setGuessNumber();
			result = false;

			while (!result) {
				System.out.print("������ �����, ������� �����: ");
				pl1.setPlayerNumber(sc.nextInt());
				result = guessN.guess(pl1.getPlayerNumber());

				if (result) {
					break;
				}

				System.out.print("������ �����, ������� �����: ");
				pl2.setPlayerNumber(sc.nextInt());
				result = guessN.guess(pl2.getPlayerNumber());
			}
			System.out.println("����������! �� ������� �����: " + guessN.getGuessNumber() + "\n" +
	                           "������ ����������? [��/���]: ");

			if (sc.next().equals("���")) {
                break;
            }
		}
	}
}