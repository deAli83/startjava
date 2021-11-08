package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String nextCalculation;
        Scanner input = new Scanner(System.in);

        Calculator calculator = new Calculator();
        do {
            System.out.println("Введите математическое выражение: [число] [знак операции] [число]");
            String mathExpression = input.nextLine();
            System.out.println(mathExpression + " = " + calculator.calculate(mathExpression));

            System.out.println("Хотите продолжить вычисления? [yes/no]:");
            if (!input.nextLine().equals("yes")) {
                break;
            }
        } while (true);
    }
}