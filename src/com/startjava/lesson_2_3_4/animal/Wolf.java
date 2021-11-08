package com.startjava.lesson_2_3_4.animal;

public class Wolf {

    private String sex;
    private String name;
    private byte weight;
    private byte age;
    private String colour;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getWeight() {
        return weight;
    }

    public void setWeight(byte weight) {
        this.weight = weight;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        if (age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void move() {
        System.out.println("идет");
    }

    public void sit() {
        System.out.println("сидит");
    }

    public void run() {
        System.out.println("бежит");
    }

    public void howl() {
        System.out.println("воет");
    }

    public void hunt() {
        System.out.println("охотится");
    }
}