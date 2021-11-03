package com.startjava.lesson_2_3.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private int secretNumber;
    private int checkNumber;
    Player player1;
    Player player2;
    Scanner input = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void launch() {
        Random random = new Random();
        int secretNumber = random.nextInt(100);
//        System.out.println("Число, загаданное компьютером = "+ secretNumber);

        do {
            System.out.println("Игрок " + player1.getName() + " введите число от 0 до 100:");
            do {
                player1.setNumber(input.nextInt());
            } while (checkNumber(player1.getNumber()));

            System.out.println("Игрок " + player2.getName() + " введите число от 0 до 100:");
            do {
                player2.setNumber(input.nextInt());
            } while (checkNumber(player2.getNumber()));

            System.out.println("Число игрока " + player1.getName() + " = " + player1.getNumber());
            if (player1.getNumber() == secretNumber) {
                break;
            } else if (player1.getNumber() < secretNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            } else if (player1.getNumber() > secretNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
            }

            System.out.println("Число игрока " + player2.getName() + " = " + player2.getNumber());
            if (player2.getNumber() == secretNumber) {
                break;
            } else if (player2.getNumber() < secretNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            } else if (player2.getNumber() > secretNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } 
        } while (true);
        System.out.println("Поздравляю, число угадано!");
    }

    private boolean checkNumber(int checkNumber) {
        if (checkNumber > 0 && checkNumber < 100) {
            return false;
        } else {
            System.out.println("Введено некорректное число: необходимо от 0 до 100 (не включительно)");
            return true;
        }
    }
}