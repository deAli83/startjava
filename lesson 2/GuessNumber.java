import java.util.Random;

public class GuessNumber {
    int secretNumber;
    Player player1;
    Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void processGame() {
        Random random = new Random();
        int secretNumber = random.nextInt(100);
        System.out.println("Число, загаданное компьютером = "+secretNumber);
        do {
            System.out.println("Число игрока " + player1.name + " = " + player1.playerNumber);
            if (player1.playerNumber == secretNumber) {
                break;
            } else if (player1.playerNumber < secretNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер");
                player1.playerNumber = player1.playerNumber + 3;
            } else if (player1.playerNumber > secretNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
                player1.playerNumber = player1.playerNumber - 5;
            }
            
            System.out.println("Число игрока " + player2.name + " = " + player2.playerNumber);
            if (player2.playerNumber == secretNumber) {
                break;
            } else if (player2.playerNumber < secretNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер");
                player2.playerNumber = player2.playerNumber + 8;
            } else if (player2.playerNumber > secretNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
                player2.playerNumber = player2.playerNumber - 4;
            } 
        } while (true);
        System.out.println("Поздравляю, число угадано!");
    }
}