package com.startjava.lesson_2_3.game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private int secretNumber;
    Player[] players = new Player[2];
    Scanner input = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        players[0] = player1;
        players[1] = player2;
    }

    public void launch() {
        System.out.println("Каждый игрок имеет 10 попыток, чтобы угадать число");
        Random random = new Random();
        int secretNumber = random.nextInt(100);
        System.out.println("Число, загаданное компьютером = "+ secretNumber);

        for (int count = 0; count < players.length; count++) {
            playerCircle(count, secretNumber);
        }
    }

    private void playerCircle(int playerIndex, int secretNumber) {
        for (int count = 0; count < 10; count++) {
            System.out.print("Игрок " + players[playerIndex].getName() + " введите число от 0 до 100: ");
            do {
                players[playerIndex].setElement(input.nextInt(), count);
            } while (checkConditionNumber(players[playerIndex].getElement(count)));

            System.out.println("Число игрока " + players[playerIndex].getName() + " = " + players[playerIndex].getElement(count));

            if (checkWinGame(players[playerIndex].getElement(count), secretNumber)) {
                System.out.println("Игрок " + players[playerIndex].getName() + " угадал число " + secretNumber + " с " + count + " попытки");
                players[playerIndex].printNumbers(count);
                players[playerIndex].fillNumbers(count);
                break;
            } else if (count == 9) {
                System.out.println("У " + players[playerIndex].getName() + " закончились попытки");
                players[playerIndex].printNumbers(count);
                players[playerIndex].fillNumbers(count);
            }
        }
    }

    private boolean checkWinGame(int checkWinGame, int secretNumber) {
        if (checkWinGame == secretNumber) {
            return true;
        } else if (checkWinGame < secretNumber) {
            System.out.println("Данное число меньше того, что загадал компьютер");
            return false;
        } else {
            System.out.println("Данное число больше того, что загадал компьютер");
            return false;
        }
    }

    private boolean checkConditionNumber(int checkConditionNumber) {
        if (checkConditionNumber > 0 && checkConditionNumber < 100) {
            return false;
        } else {
            System.out.println("Введено некорректное число: необходимо от 0 до 100 (не включительно)");
            return true;
        }
    }
}