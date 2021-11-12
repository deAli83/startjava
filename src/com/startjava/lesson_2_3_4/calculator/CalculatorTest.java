package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    static Scanner input = new Scanner(System.in);
    static Calculator calculator = new Calculator();

    public static void main(String[] args) {
        launch();
        do {
            String yesNo;
            System.out.println("Хотите продолжить вычисления? [yes/no]:");
            yesNo = input.nextLine();
            if (yesNo.equals("no")) {
                break;
            } else if (yesNo.equals("yes")) {
                launch();
            }
        } while (true);
    }

    private static void launch() {
        System.out.println("Введите математическое выражение: [число] [знак операции] [число]");
        String mathExpression = input.nextLine();
        System.out.println(mathExpression + " = " + calculator.calculate(mathExpression));
    }
}