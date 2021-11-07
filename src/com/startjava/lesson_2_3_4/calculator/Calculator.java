package com.startjava.lesson_2_3.calculator;

public class Calculator {

    private String numberOperatorNumber;
    private int calculate;
    private String[] calculateData;

    public void setNumberOperatorNumber(String numberOperatorNumber) {
        this.numberOperatorNumber = numberOperatorNumber;
        calculateData = numberOperatorNumber.split(" ");
        calculate(calculateData);
    }

    public int getCalculate() {
        return calculate;
    }

    public String getCalculateData(int i) {
        return calculateData[i];
    }

    private int calculate(String[] calculateData) {
        switch(calculateData[1]) {
            case "+" :
                calculate = Math.addExact(Integer.parseInt(calculateData[0]), Integer.parseInt(calculateData[2]));
                break;
            case "-" :
                calculate = Math.subtractExact(Integer.parseInt(calculateData[0]), Integer.parseInt(calculateData[2]));
                break;
            case "*" :
                calculate = Math.multiplyExact(Integer.parseInt(calculateData[0]), Integer.parseInt(calculateData[2]));
                break;
            case "/" :
                calculate = Integer.parseInt(calculateData[0]) / Integer.parseInt(calculateData[2]);
                break;
            case "^" :
                calculate = (int) Math.pow(Integer.parseInt(calculateData[0]), Integer.parseInt(calculateData[2]));
                break;
            case "%" :
                calculate = Integer.parseInt(calculateData[0]) % Integer.parseInt(calculateData[2]);
        }
        return calculate;
    }
}
