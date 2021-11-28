package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        String mathExpression;
        do {
            System.out.println("Введите математическое выражение: [число] [знак операции] [число]");
            mathExpression = input.nextLine();
            System.out.println(mathExpression + " = " + calculator.calculate(mathExpression));
        } while (checkNext().equals("yes"));
    }

    private static String checkNext() {
        String yesNo;
        do {
            System.out.println("Хотите продолжить вычисления? [yes/no]:");
            yesNo = input.nextLine();
        } while (!yesNo.equals("no") && !yesNo.equals("yes"));
        return yesNo;
    }
}