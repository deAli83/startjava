package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private int secretNumber;
    private boolean win;
    private Player[] players = new Player[2];
    Scanner input = new Scanner(System.in);

    public GuessNumber(Player[] players) {
        for (int i = 0; i < players.length; i++) {
            this.players[i] = players[i];
        }
    }

    public void launch() {
        boolean win = false;
        System.out.println("Каждый игрок имеет 10 попыток, чтобы угадать число");
        Random random = new Random();
        secretNumber = random.nextInt(101);
        System.out.println("Число, загаданное компьютером = " + secretNumber);

        for (int count = 0; count < 10; count++) {
            if (win) {
                break;
            }

            for (int i = 0; i < players.length; i++) {
                if (makeMove(players[i], count)) {
                    win = true;
                    break;
                }
            }
        }

        for (int i = 0; i < players.length; i++) {
            int[] numbers = players[i].getNumbers();
            System.out.println(Arrays.toString(numbers).replaceAll("[\\[|\\]|,]", ""));
            players[i].fillNumbers();
        }
    }

    private boolean makeMove(Player player, int count) {
        player.setTryNumber(count);
        System.out.print("Игрок " + player.getName() + " введите число от 0 до 100: ");
        while (!player.setNumber(input.nextInt())) {
            System.out.println("Введено некорректное число: необходимо от 0 до 100 (включительно)");
        }
        String name = player.getName();
        int number = player.getCurrentNumber();
        System.out.println("Число игрока " + name + " = " + number);

        int tryNumber = player.getTryNumber();
        if (compareNumbers(number)) {
            System.out.println("Игрок " + name + " угадал число " + secretNumber + " с " + (tryNumber + 1) + " попытки");
            return true;
        } else if (tryNumber == 9) {
            System.out.println("У " + name + " закончились попытки");
        }
        return false;
    }

    private boolean compareNumbers(int playerNumber) {
        if (playerNumber == secretNumber) {
            return true;
        }
        System.out.println("Данное число " + ((playerNumber < secretNumber) ? "меньше " : "больше ") + "того, что загадал компьютер");
        return false;
    }
}