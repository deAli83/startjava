import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private int secretNumber;
    private int checkNumber;
    private int playerNumber1;
    private int playerNumber2;
    Player player1;
    Player player2;
    Scanner input = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void launch() {
        Random random = new Random();
        int secretNumber = random.nextInt(100);
        System.out.println("Число, загаданное компьютером = "+ secretNumber);

        System.out.println("Игрок " + player1.getName() + " введите число от 0 до 100:");
        do {
            playerNumber1 = input.nextInt();
        } while (checkNumber(playerNumber1));

        System.out.println("Игрок " + player2.getName() + " введите число от 0 до 100:");
        do {
            playerNumber2 = input.nextInt();
        } while (checkNumber(playerNumber2));

        do {
            System.out.println("Число игрока " + player1.getName() + " = " + playerNumber1);
            if (playerNumber1 == secretNumber) {
                break;
            } else if (playerNumber1 < secretNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер");
                playerNumber1 = playerNumber1 + 3;
            } else if (playerNumber1 > secretNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
                playerNumber1 = playerNumber1 - 5;
            }
            
            System.out.println("Число игрока " + player2.getName() + " = " + playerNumber2);
            if (playerNumber2 == secretNumber) {
                break;
            } else if (playerNumber2 < secretNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер");
                playerNumber2 = playerNumber2 + 8;
            } else if (playerNumber2 > secretNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
                playerNumber2 = playerNumber2 - 4;
            } 
        } while (true);
        System.out.println("Поздравляю, число угадано!");
    }

    public boolean checkNumber(int checkNumber) {
        this.checkNumber = checkNumber;
        if (checkNumber > 0 && checkNumber < 100) {
            return false;
        } else {
            System.out.println("Введено некорректное число: необходимо от 0 до 100 (не включительно)");
            return true;
        }
    }
}