import java.util.Scanner;

public class Calculator {
    Scanner inputNumbers = new Scanner(System.in);
    Scanner inputOperator = new Scanner(System.in);

    private int number1;

    public int getNumber1() {
        return number1;
    }

    public void setNumber1() {
        number1 = inputNumbers.nextInt();
    }

    private int number2;

    public int getNumber2() {
        return number2;
    }

    public void setNumber2() {
        number2 = inputNumbers.nextInt();
    }

    private String operator;

    public String getOperator() {
        return operator;
    }
    private int result;
    private boolean condition;

    public void setOperator() {
        do {
            operator = inputOperator.nextLine();
            condition = false;
            switch(operator) {
                case "+" :
                    break;
                case "-" :
                    break;
                case "*" :
                    break;
                case "/" :
                    break;
                case "^" :
                    break;
                case "%" :
                    break;
                default:
                    System.out.println("Введен некорректный знак. Введите: '+', '-', '*' , '/' , '^', '%'");
                    condition = true;
            }
        } while (condition);
    }

    public int getResult() {
        switch(operator) {
            case "+" :
                result = number1 + number2;
                break;
            case "-" :
                result = number1 - number2;
                break;
            case "*" :
                result = number1 * number2;
                break;
            case "/" :
                result = number1 / number2;
                break;
            case "^" :
                result = 1;
                for (int count = 1; count <= number2; count++) {
                    result = result * number1;
                }
                break;
            case "%" :
                result = number1 % number2;
        }
        return result;
    }

    private String nextCalculation;

    public String getNextCalculation() {
        return nextCalculation;
    }

    private boolean conditionYN;

    public boolean getConditionYN (){
        switch(nextCalculation) {
            case "yes":
                conditionYN = true;
                break;
            case "no":
                conditionYN = false;
        }
        return conditionYN;
    }

    public void setNextCalculation() {
        do {
            nextCalculation = inputOperator.nextLine();
            condition = false;
            switch(nextCalculation){
                case("yes"):
                    break;
                case("no"):
                    break;
                default:
                    System.out.println("Некорректное значение. Введите [yes/no]");
                    condition = true;
            }
        } while (condition);
    }
}