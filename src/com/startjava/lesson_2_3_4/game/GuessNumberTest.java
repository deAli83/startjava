package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    static Scanner input = new Scanner(System.in);
    static Player[] players = new Player[2];

    public static void main(String[] args) {
        for (int i = 0; i < players.length; i++) {
            createPlayer(i);
        }

        GuessNumber game = new GuessNumber(players);

        game.launch();

        do {
            System.out.println("Хотите продолжить игру? [yes/no]:");
            String yesNo = input.nextLine();
            if (yesNo.equals("no")) {
                break;
            } else if (yesNo.equals("yes")) {
                game.launch();
            }
        } while (true);
    }

    private static void createPlayer(int i) {
        System.out.println("Введите имя " + (i + 1) + " игрока:");
        players[i] = new Player(input.nextLine());
    }
}