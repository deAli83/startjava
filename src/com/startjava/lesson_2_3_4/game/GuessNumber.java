package com.startjava.lesson_2_3_4.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private int secretNumber;
    private Player[] players = new Player[2];
    private boolean[] playersWin;
    private int[] playersLastTry = new int [2];
    Scanner input = new Scanner(System.in);

    public GuessNumber(Player[] players) {
        for ( int i = 0; i < players.length; i++) {
            this.players[i] = players[i];
        }
    }

    public void launch() {
        System.out.println("Каждый игрок имеет 10 попыток, чтобы угадать число");
        Random random = new Random();
        secretNumber = random.nextInt(101);
        playersWin = new boolean[players.length];
        System.out.println("Число, загаданное компьютером = " + secretNumber);

        for (int count = 0; count < 10; count++) {
            for (int playerIndex = 0; playerIndex < players.length; playerIndex++) {
                if (!playersWin[playerIndex]) {
                    playersLastTry[playerIndex] = count;
                    makeMove(playerIndex, count);
                }
            }
        }

        for (int playerIndex = 0; playerIndex < players.length; playerIndex++) {
            printNumbers(playerIndex, playersLastTry[playerIndex]);
            players[playerIndex].fillNumbers(playersLastTry[playerIndex]);
        }
    }

    private void makeMove(int playerIndex, int count) {
        System.out.print("Игрок " + players[playerIndex].getName() + " введите число от 0 до 100: ");
        do {
        } while (players[playerIndex].setNumber(input.nextInt(), count));
        System.out.println("Число игрока " + players[playerIndex].getName() + " = " + players[playerIndex].getCurrentNumber(count));

        if (compareNumbers(players[playerIndex].getCurrentNumber(count), secretNumber, playerIndex)) {
            System.out.println("Игрок " + players[playerIndex].getName() + " угадал число " + secretNumber + " с " + (count + 1) + " попытки");
        } else if (count == 9) {
            System.out.println("У " + players[playerIndex].getName() + " закончились попытки");
        }
    }

    private boolean compareNumbers(int playerNumber, int secretNumber, int playerIndex) {
        if (playerNumber == secretNumber) {
            playersWin[playerIndex] = true;
            return true;
        } else if (playerNumber < secretNumber) {
            System.out.println("Данное число меньше того, что загадал компьютер");
        } else {
            System.out.println("Данное число больше того, что загадал компьютер");
        }
        return false;
    }

    public void printNumbers (int playerIndex, int count) {
        for (int i = 0; i <= count; i++) {
            System.out.print(players[playerIndex].getCurrentNumber(i) + " ");
        }
        System.out.println();
    }
}