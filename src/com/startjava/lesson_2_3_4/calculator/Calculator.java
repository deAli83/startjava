package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private String[] calculateData;

    public int calculate(String mathExpression) {
        calculateData = mathExpression.split(" ");
        switch(calculateData[1]) {
            case "+" :
                return Math.addExact(Integer.parseInt(calculateData[0]), Integer.parseInt(calculateData[2]));
            case "-" :
                return Math.subtractExact(Integer.parseInt(calculateData[0]), Integer.parseInt(calculateData[2]));
            case "*" :
                return Math.multiplyExact(Integer.parseInt(calculateData[0]), Integer.parseInt(calculateData[2]));
            case "/" :
                return Integer.parseInt(calculateData[0]) / Integer.parseInt(calculateData[2]);
            case "^" :
                return (int) Math.pow(Integer.parseInt(calculateData[0]), Integer.parseInt(calculateData[2]));
            case "%" :
                return Integer.parseInt(calculateData[0]) % Integer.parseInt(calculateData[2]);
            default :
                return 0;
        }
    }
}
