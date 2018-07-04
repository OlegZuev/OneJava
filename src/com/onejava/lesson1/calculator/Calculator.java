package com.onejava.lesson1.calculator;

	/**
	 * Сделай калькулятор. Операции, которые он должен уметь выполнять: +, -, *, /, ^, %
	 */
public class Calculator {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 3;
		int i = 0;
		char mathoperation = '+';

		if (mathoperation == '+') {
			System.out.print(num1 + num2);
		} else if (mathoperation == '-') {
			System.out.print(num1 - num2);
		} else if (mathoperation == '/') {
			System.out.print(num1 / num2);
		} else if (mathoperation == '*') {
			System.out.print(num1 * num2);
		} else if (mathoperation == '^') {
			int numTemp = num1;
			for (i = num2; i > 1; i--){
				num1 *= numTemp;
			}
			System.out.print(num1);
		} else if (mathoperation == '%') {
			System.out.print(num1 % num2);
		}
	}
}