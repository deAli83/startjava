import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        String name;
        String endGame;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Введите имя первого игрока:");
        name = input.nextLine();
        Player player1 = new Player(name);

        System.out.println("Введите имя второго игрока:");
        name = input.nextLine();
        Player player2 = new Player(name);

        GuessNumber game = new GuessNumber(player1, player2);
        do {
            game.launch();
            System.out.println("Хотите продолжить игру? [yes/no]:");
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