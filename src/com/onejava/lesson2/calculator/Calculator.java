package com.onejava.lesson2.calculator;

public class Calculator {
	private int num1;
	private int num2;
	private char mathOperation;
	private int result;

	public int getNum1() {
		return num1;
	}
	
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	
	public int getNum2(){
		return num2;
	}
	
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public char getMathOperation() {
		return mathOperation;
	}
	
	public void setMathOperation(char mathOperation) {
		this.mathOperation = mathOperation;
	}
	
	public int getResult() {
		return result;
	}
	
	public void calculate() {
		switch(mathOperation) {
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '/':
				result = num1 / num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '^':
				int numTemp = num1;
				for (int i = 1; i < num2; i++) {
					num1 *= numTemp;
				}
				result = num1;
				break;
			case '%':
				result = num1 % num2;
				break;
		}
	}
}