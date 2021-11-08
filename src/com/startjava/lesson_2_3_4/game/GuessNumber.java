package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private int secretNumber;
    private Player[] players = new Player[2];
    Scanner input = new Scanner(System.in);

    public GuessNumber(Player[] players) {
        for (int i = 0; i < players.length; i++) {
            this.players[i] = players[i];
        }
    }

    public void launch() {
        System.out.println("Каждый игрок имеет 10 попыток, чтобы угадать число");
        Random random = new Random();
        secretNumber = random.nextInt(101);
        System.out.println("Число, загаданное компьютером = " + secretNumber);

        for (int count = 0; count < 10; count++) {
            for (int playerIndex = 0; playerIndex < players.length; playerIndex++) {
                if (!players[playerIndex].isPlayerWin()) {
                    players[playerIndex].setPlayerTry(count);
                    makeMove(playerIndex, count);
                }
            }
        }

        for (int playerIndex = 0; playerIndex < players.length; playerIndex++) {
            System.out.println(Arrays.toString(players[playerIndex].getNumbers()).replaceAll("[\\[|\\]|,]", ""));
            players[playerIndex].fillNumbers(players[playerIndex].getPlayerTry());
        }
    }

    private void makeMove(int playerIndex, int count) {
        System.out.print("Игрок " + players[playerIndex].getName() + " введите число от 0 до 100: ");
        while (players[playerIndex].setNumber(input.nextInt(), count)) {
            System.out.println("Введено некорректное число: необходимо от 0 до 100 (включительно)");
        }
        String name = players[playerIndex].getName();
        int number = players[playerIndex].getCurrentNumber(count);
        System.out.println("Число игрока " + name + " = " + number);

        if (compareNumbers(number, secretNumber, playerIndex)) {
            System.out.println("Игрок " + name + " угадал число " + secretNumber + " с " + (count + 1) + " попытки");
        } else if (count == 9) {
            System.out.println("У " + name + " закончились попытки");
        }
    }

    private boolean compareNumbers(int playerNumber, int secretNumber, int playerIndex) {
        if (playerNumber == secretNumber) {
            players[playerIndex].setPlayerWin(true);
            return true;
        } else if (playerNumber < secretNumber) {
            System.out.println("Данное число меньше того, что загадал компьютер");
        } else {
            System.out.println("Данное число больше того, что загадал компьютер");
        }
        return false;
    }
}