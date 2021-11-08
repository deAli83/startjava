package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
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
        if (number >= 0 && number <= 100) {
            numbers[count] = number;
            return false;
        } else {
            System.out.println("Введено некорректное число: необходимо от 0 до 100 (включительно)");
            return true;
        }
    }

    public void fillNumbers(int count) {
        Arrays.fill(numbers, 0, count, 0);
    }
}