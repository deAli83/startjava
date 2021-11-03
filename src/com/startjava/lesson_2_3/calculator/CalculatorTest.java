package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String nextCalculation;
        boolean conditionYN;
        Scanner inputNumbers = new Scanner(System.in);
        Scanner inputOperator = new Scanner(System.in);

        Calculator calculator = new Calculator();
        do {
            System.out.println("Введите первое число");
            calculator.setNumber1(inputNumbers.nextInt());

            do {
            System.out.println("Введите знак математической операции");
            calculator.setOperator(inputOperator.nextLine());
            } while (calculator.checkOperator());

            System.out.println("Введите второе число");
            calculator.setNumber2(inputNumbers.nextInt());

            System.out.println(calculator.getNumber1() + " " + calculator.getOperator() + " " + calculator.getNumber2() + " = " + calculator.getCalculate());

            System.out.println("Хотите продолжить вычисления? [yes/no]:");
            do {
                nextCalculation = inputOperator.nextLine();
                conditionYN = false;
                switch(nextCalculation){
                    case("yes"):
                        break;
                    case("no"):
                        break;
                    default:
                    System.out.println("Некорректное значение. Введите [yes/no]");
                    conditionYN = true;
                }

            } while (conditionYN);

            switch(nextCalculation) {
                case "yes":
                    conditionYN = true;
                    break;
                case "no":
                    conditionYN = false;
            }            
        } while(conditionYN);
    }
}