package com.startjava.lesson_2_3.calculator;

public class Calculator {

    private int number1;
    private int number2;
    private String operator;
    private int calculate;
    private boolean conditionOperator;

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public boolean checkOperator() {
        conditionOperator = false;
        switch(operator) {
            case "+" :
                break;
            case "-" :
                break;
            case "*" :
                break;
            case "/" :
                break;
            case "^" :
                break;
            case "%" :
                break;
            default:
                System.out.println("Введен некорректный знак. Введите: '+', '-', '*' , '/' , '^', '%'");
                conditionOperator = true;
            }
        return conditionOperator;
    }

    public int getCalculate() {
        switch(operator) {
            case "+" :
                calculate = number1 + number2;
                break;
            case "-" :
                calculate = number1 - number2;
                break;
            case "*" :
                calculate = number1 * number2;
                break;
            case "/" :
                calculate = number1 / number2;
                break;
            case "^" :
                calculate = 1;
                for (int count = 1; count <= number2; count++) {
                    calculate = calculate * number1;
                }
                break;
            case "%" :
                calculate = number1 % number2;
        }
        return calculate;
    }
}