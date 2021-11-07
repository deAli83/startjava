package com.startjava.lesson_2_3.game;

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

    public int getElement(int count) {
        return numbers[count];
    }

    public void setElement(int number, int count) {
        numbers[count] = number;
    }

    public void fillNumbers (int count) {
        Arrays.fill(numbers, 0, count, 0);
    }

    public void printNumbers (int count) {
        for (int i = 0; i <= count; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}