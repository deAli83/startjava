package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    static Scanner input = new Scanner(System.in);
    static Player[] players = new Player[2];

    public static void main(String[] args) {
        createPlayers();
        GuessNumber game = new GuessNumber(players);

        do {
            game.launch();
        } while (checkNext().equals("yes"));
    }

    private static void createPlayers() {
        for (int i = 0; i < players.length; i++) {
            System.out.println("Введите имя " + (i + 1) + " игрока:");
            players[i] = new Player(input.nextLine());
        }
    }

    private static String checkNext() {
        String yesNo;
        do {
            System.out.println("Хотите продолжить игру? [yes/no]:");
            yesNo = input.nextLine();
        } while (!(yesNo.equals("no") | yesNo.equals("yes")));
        return yesNo;
    }
}