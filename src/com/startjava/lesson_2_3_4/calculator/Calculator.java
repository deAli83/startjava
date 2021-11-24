package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private String[] mathData;

    public int calculate(String mathExpression) {
        mathData = mathExpression.split(" ");
        int number1 = Integer.parseInt(mathData[0]);
        int number2 = Integer.parseInt(mathData[2]);
        switch (mathData[1]) {
            case "+":
                return Math.addExact(number1, number2);
            case "-":
                return Math.subtractExact(number1, number2);
            case "*":
                return Math.multiplyExact(number1, number2);
            case "/":
                return number1 / number2;
            case "^":
                return (int) Math.pow(number1, number2);
            case "%":
                return number1 % number2;
            default:
                return 0;
        }
    }
}
