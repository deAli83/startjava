public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        do {
            System.out.println("Введите первое число");
            calculator.setNumber1();

            System.out.println("Введите знак математической операции");
            calculator.setOperator();

            System.out.println("Введите второе число");
            calculator.setNumber2();

            System.out.println(calculator.getNumber1() + " " + calculator.getOperator() + " " + calculator.getNumber2() + " = " + calculator.getResult());
            System.out.println("Хотите продолжить вычисления? [yes/no]:");
            calculator.setNextCalculation();
        } while(calculator.getConditionYN());
    }
}