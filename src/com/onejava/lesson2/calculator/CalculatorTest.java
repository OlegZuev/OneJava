package com.onejava.lesson2.calculator;

import java.util.*;

public class CalculatorTest {
	public static void main(String[]args) {
		
		/*
		������������� ��������� �����������:
		���������� �������������� ����� CalculatorTest
		��� �������� ����� �������������� �������� �������������� ���������� switch
		��� ����� �����  ����� �������������� �������� ����������� ���������� (����� Scanner)
		������ ����� ��������������� ��������� ��� ��������� ����������� (������):
		������� ������ �����: 10
		������� ���� �������������� ��������: +
		������� ������ �����: 10
		����� main ���������� ��������� � �������, � ����� ������� ������������ ����� Test
		 */
		Scanner sc = new Scanner(System.in);
		Calculator calculator = new Calculator();
		
		while (true) {
			System.out.print("������� ������ �����: ");
			calculator.setNum1(sc.nextInt());
		
			System.out.print("������� ���� ��������: ");
			calculator.setMathOperation(sc.next().charAt(0));
		
			System.out.print("������� ������ �����: ");
			calculator.setNum2(sc.nextInt());
		
			calculator.calculate();
			System.out.print("���������: " + calculator.getResult() + "\n" +
				             "������ ����������? [��/���]: ");

			if (sc.next().equals("���")) {
                break;
            }
		}	
	}
}