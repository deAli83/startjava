package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String nextCalculation;
        Scanner input = new Scanner(System.in);

        Calculator calculator = new Calculator();
        do {
            System.out.println("Введите математическое выражение: [число] [знак операции] [число]");
            calculator.setNumberOperatorNumber(input.nextLine());

            System.out.println(calculator.getCalculateData(0) + " " + calculator.getCalculateData(1) + " " + calculator.getCalculateData(2) + " = " + calculator.getCalculate());

            System.out.println("Хотите продолжить вычисления? [yes/no]:");
            do {
                nextCalculation = input.nextLine();
                if (nextCalculation.equals("yes") || nextCalculation.equals("no")) {
                    break;
                } else {
                    System.out.println("Введите [yes/no]:");
                }
            } while (true);
        } while(nextCalculation.equals("yes"));
    }
}