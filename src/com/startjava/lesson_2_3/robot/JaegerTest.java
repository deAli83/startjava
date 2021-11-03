package com.startjava.lesson_2_3.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger("Brawler Yukon", "Mark I", "United States of America");
        System.out.println(jaeger1);

        jaeger1.drift();
        jaeger1.attack();

        Jaeger jaeger2 = new Jaeger("Coyote Tango", "Mark I", "Japan");
        System.out.println(jaeger2);

        jaeger2.drift();
        jaeger2.attack();

        jaeger1.setModelName("Horizon Brave");
        jaeger1.setOrigin("China");
        System.out.println(jaeger1);

        jaeger1.drift();
        jaeger1.attack();
    }
}