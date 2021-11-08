package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    static Scanner input = new Scanner(System.in);
    static Player[] players = new Player[2];

    public static void main(String[] args) {

        for (int i = 0; i < 2; i++) {
            inputPlayerNames(i);
        }

        GuessNumber game = new GuessNumber(players);

        String playerAnswer;
        do {
            game.launch();
            System.out.println("Хотите продолжить игру? [yes/no]:");
            do {
                playerAnswer = input.nextLine();
                if (playerAnswer.equals("yes") || playerAnswer.equals("no")) {
                    break;
                } else {
                    System.out.println("Некорректное значение. Введите [yes/no]");
                }
            } while (true);
        } while (playerAnswer.equals("yes"));
    }

    private static void inputPlayerNames(int i) {
        System.out.println("Введите имя " + (i + 1) + " игрока:");
        players[i] = new Player(input.nextLine());
    }
}