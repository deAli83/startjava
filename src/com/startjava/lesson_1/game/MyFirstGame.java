package com.startjava.lesson_1.game;

public class MyFirstGame {
    public static void main(String[] args) {
        int secretNumber = 36;
        int playerNumber = 99;
        System.out.println("Число игрока = " + playerNumber);
        do {
            if (playerNumber < secretNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер");
                playerNumber = playerNumber + 13;
                System.out.println("Число игрока = " + playerNumber);
            } else if (playerNumber > secretNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
                playerNumber = playerNumber - 15;
                System.out.println("Число игрока = " + playerNumber);
            }
        } while (playerNumber != secretNumber);
        System.out.println("Поздравляю, число угадано!");
    }
}