package com.startjava.lesson_2_3.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Введите имя первого игрока:");
        String name = input.nextLine();
        Player player1 = new Player(name);

        System.out.println("Введите имя второго игрока:");
        name = input.nextLine();
        Player player2 = new Player(name);

        GuessNumber game = new GuessNumber(player1, player2);

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
        } while(playerAnswer.equals("yes"));
    }
}