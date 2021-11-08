package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int playerTry;
    private boolean playerWin;
    private int[] numbers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCurrentNumber(int count) {
        return numbers[count];
    }

    public boolean setNumber(int number, int count) {
        if (number <= 0 || number >= 100) {
            return true;
        }
        numbers[count] = number;
        return false;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, playerTry + 1);
    }

    public int getPlayerTry() {
        return playerTry;
    }

    public void setPlayerTry(int playerTry) {
        this.playerTry = playerTry;
    }

    public boolean isPlayerWin() {
        return playerWin;
    }

    public void setPlayerWin(boolean playerWin) {
        this.playerWin = playerWin;
    }

    public void fillNumbers(int count) {
        Arrays.fill(numbers, 0, count, 0);
        playerWin = false;
    }
}