package com.onejava.lesson2.calculator;

import java.util.*;

/**
 * Модифицируйте программу Калькулятор:
 * реализуйте дополнительный класс CalculatorTest
 * для проверки знака математической операции воспользуйтесь оператором switch
 * Для ввода чисел  знака математической операции используйте клавиатуру (класс Scanner)
 * Формат ввода математического выражения для программы Калькулятор (пример):
 * Введите первое число: 10
 * Введите знак математической операции: +
 * Введите второе число: 10
 * Метод main необходимо размещать в классах, в имени которых присутствует слово Test
 *
 * Модифицируйте программу Калькулятор, используя для хранения значений математического выражения массивы:
 * воспользуйтесь методами класса Math, какие только сможете найти, заменив ими ваши реализации, связанные с вычислениями
 * для разбиения математического выражения на составляющие и сохранения их в массив, используйте метод String.split();
 */

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

        do {
            System.out.print("Введите математическое выражение: ");
            calculator.setMathExpression(sc.nextLine());

            calculator.calculate();
            System.out.print("Результат: " + calculator.getResult() + "\n" +
                    "Хотите продолжить? [да/нет]: ");
        } while (!sc.nextLine().equals("нет"));
    }
}