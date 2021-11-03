package com.startjava.lesson_1.calculator;

public class Calculator {
    public static void main(String[] args) {
        int number1 = 30;
        int number2 = 7;
        int result = 0;
        char operator = '*';

        if (operator == '+') {
            result = number1 + number2;
        } else if (operator == '-') {
            result = number1 - number2;
        } else if (operator == '*') {
            result = number1 * number2;
        } else if (operator == '/') {
            result = number1 / number2;
        } else if (operator == '^') {
            int count = 1;
            result = number1;
            while (count <= number2) {
                result *= number1;
                count++;
            }
        } else if (operator == '%') {
            result = number1 % number2;
        }
        System.out.println(number1 + " " + operator + " " + number2 + " = " + result);
    }
}