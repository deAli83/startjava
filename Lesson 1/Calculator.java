public class Calculator {
    public static void main(String[] args) {
        int number1 = 30;
        int number2 = 7;
        int result;
        char operator = '%';

        if (operator == '+') {
            result = number1 + number2;
            System.out.println(number1 + " + " + number2 + " = " + result);
        } else if (operator == '-') {
            result = number1 - number2;
            System.out.println(number1 + " - " + number2 + " = " + result);
        } else if (operator == '*') {
            result = number1 * number2;
            System.out.println(number1 + " * " + number2 + " = " + result);
        } else if (operator == '/') {
            result = number1 / number2;
            System.out.println(number1 + " / " + number2 + " = " + result);
        } else if (operator == '^') {
            int count = 1;
            result = number1;
            while (count <= number2) {
                result = number1 * number1;
                count++;
            }
            System.out.println(number1 + " ^ " + number2 + " = " + result);
        } else if (operator == '%') {
            result = number1 % number2;
            System.out.println(number1 + " % " + number2 + " = " + result);
        }
    }
}