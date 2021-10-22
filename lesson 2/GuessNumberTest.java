import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        String name;
        int playerNumber;
        String endGame;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Введите имя первого игрока:");
        name = input.nextLine();
        Player player1 = new Player(name);

        System.out.println("Введите имя второго игрока:");
        name = input.nextLine();
        Player player2 = new Player (name);

        do {
            System.out.println("Игрок " + player1.name + " введите число от 0 до 100:");
            do {
                player1.playerNumber = input.nextInt();
            } while (player2.checkNumber(player1.playerNumber));

            System.out.println("Игрок " + player2.name + " введите число от 0 до 100:");
            do {
                player2.playerNumber = input.nextInt();
            } while (player2.checkNumber(player2.playerNumber));

            GuessNumber game = new GuessNumber(player1, player2);
            game.processGame();
            System.out.println("Хотите продолжить игру? [yes/no]:");
            input.nextLine();
            boolean conditionYN = true;
            do {
                endGame = input.nextLine();
                switch (endGame) {
                    case "yes":
                        conditionYN = false;
                        break;
                    case "no":
                        conditionYN = false;
                        break;
                    default:
                        System.out.println("Некорректное значение. Введите [yes/no]");
                }
            } while (conditionYN);
        } while(endGame.equals("yes"));
    }
}