package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private String[] mathExpression;

    public int calculate(String mathExpressionSolid) {
        mathExpression = mathExpressionSolid.split(" ");
        int number1 = Integer.parseInt(mathExpression[0]);
        int number2 = Integer.parseInt(mathExpression[2]);
        switch (mathExpression[1]) {
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
