package com.startjava.lesson_2_3.robot;

public class Jaeger {

    private String modelName;
    private String mark;
    private String origin;

    public Jaeger (String modelName, String mark, String origin) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getMark() {
        return mark;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getOrigin() {
        return origin;
    }

    public void drift() {
        System.out.println("Neural bridge created");
    }

    public void attack() {
        System.out.println("Kaiju is under attack");
    }

    @Override
    public String toString() {
        return String.format("Model = %s \nMark = %s \nOrigin = %s \n",
            modelName, mark, origin);
    }
}