package com.onejava.lesson2.calculator;

import java.util.*;

public class CalculatorTest {
	public static void main(String[]args) {
		
		/*
		Модифицируйте программу Калькулятор:
		реализуйте дополнительный класс CalculatorTest
		для проверки знака математической операции воспользуйтесь оператором switch
		Для ввода чисел  знака математической операции используйте клавиатуру (класс Scanner)
		Формат ввода математического выражения для программы Калькулятор (пример):
		Введите первое число: 10
		Введите знак математической операции: +
		Введите второе число: 10
		Метод main необходимо размещать в классах, в имени которых присутствует слово Test
		 */
		Scanner sc = new Scanner(System.in);
		Calculator calculator = new Calculator();
		
		while (true) {
			System.out.print("Введите первое число: ");
			calculator.setNum1(sc.nextInt());
		
			System.out.print("Введите знак операции: ");
			calculator.setMathOperation(sc.next().charAt(0));
		
			System.out.print("Введите второе число: ");
			calculator.setNum2(sc.nextInt());
		
			calculator.calculate();
			System.out.print("Результат: " + calculator.getResult() + "\n" +
				             "Хотите продолжить? [да/нет]: ");

			if (sc.next().equals("нет")) {
                break;
            }
		}	
	}
}