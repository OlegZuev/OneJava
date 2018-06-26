package com.onejava.lesson1.guessinggame;

import java.util.*;

public class GuessingGame {
    public static void main(String[]args) {
        
        /*
        ������ ����� ���������
        ��������� ���������� ����� �� 0 �� 100, ������� �� ����������.
        ���� ������� ���������� ����������, �� ���������� � SOUT ���� ���� ���������, ��� ����� ������ ��� ������ ��������� �����������.
        ���� ������, ������ ������.
        ���� ������������ �� ��� ���, ���� �� �������� �����.
         */
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int guessingNumber;
        int numberOfPlayer;
        
        while (true) {
            guessingNumber = rd.nextInt(100);
            System.out.print("������� �����: ");
            numberOfPlayer = sc.nextInt();
        
            while (guessingNumber != numberOfPlayer) {
                if (guessingNumber < numberOfPlayer) {
                    System.out.println("���� ����� ������ ������������.");
                } else {
                    System.out.println("���� ����� ������ ������������.");
                }

                System.out.print("������� �����: ");
                numberOfPlayer = sc.nextInt();
            }
            System.out.println("����������! �� ������� �����: " + numberOfPlayer + "\n" +
                               "������ ����������? [��/���]: ");
            
            if (sc.next().equals("���")) {
                break;
            }
        }
    }
}