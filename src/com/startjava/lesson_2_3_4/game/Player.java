package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int tryNumber;
    private int[] numbers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCurrentNumber() {
        return numbers[tryNumber];
    }

    public boolean setNumber(int number) {
        if (number >= 0 && number <= 100) {
            numbers[tryNumber] = number;
            return true;
        }
        return false;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, tryNumber + 1);
    }

    public int getTryNumber() {
        return tryNumber;
    }

    public void setTryNumber(int tryNumber) {
        this.tryNumber = tryNumber;
    }

    public void fillNumbers() {
        Arrays.fill(numbers, 0, tryNumber + 1, 0);
        tryNumber = 0;
    }
}