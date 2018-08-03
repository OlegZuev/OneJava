package com.onejava.lesson2.calculator;

public class Calculator {
    private int result;
    private String[] mathExpression;

    public int getResult() {
        return result;
    }

    public void setMathExpression(String mathExpression) {
        this.mathExpression = mathExpression.split(" ");
    }

    public void calculate() {
        int num1 = Integer.parseInt(mathExpression[0]);
        int num2 = Integer.parseInt(mathExpression[2]);

        switch (mathExpression[1]) {
            case "+":
                result = Math.addExact(num1, num2);
                break;
            case "-":
                result = Math.subtractExact(num1, num2);
                break;
            case "/":
                result = Math.floorDiv(num1, num2);
                break;
            case "*":
                result = Math.multiplyExact(num1, num2);
                break;
            case "^":
                result = (int) Math.pow(num1, num2);
                break;
            case "%":
                result = Math.floorMod(num1, num2);
                break;
        }
    }
}