package com.startjava.lesson_2_3.animal;

public class WolfTest {
    public static void main(String[] args) {
        Wolf grey = new Wolf();
        grey.setSex("male");
        grey.setName("Серый");
        grey.setWeight((byte)10);
        grey.setAge((byte)9);
        grey.setColour("grey");

        System.out.println("Пол = " + grey.getSex());
        System.out.println("Кличка = " + grey.getName());
        System.out.println("Вес = " + grey.getWeight());
        System.out.println("Возраст = " + grey.getAge());
        System.out.println("Окрас = " + grey.getColour());

        grey.move();
        grey.sit();
        grey.run();
        grey.howl();
        grey.hunt();
    }
}