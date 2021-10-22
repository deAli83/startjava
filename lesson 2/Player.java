public class Player {
    String name;
    int playerNumber;

    public Player (String name) {
        this.name = name;
        this.playerNumber = 0;
    }

    public boolean checkNumber(int playerNumber) {
        this.playerNumber = playerNumber;
            if (playerNumber > 0 && playerNumber < 100) {
                return false;
            } else {
                System.out.println("Введено некорректное число: необходимо от 0 до 100 (не включительно)");
                return true;
            }
        }
}