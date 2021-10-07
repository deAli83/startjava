public class MyFirstGame {
    public static void main(String[] args) {
        int secretNumber = 36;
        int tryNumber = 99;
        System.out.println("Число игрока = " + tryNumber);
        do {
            if (tryNumber < secretNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер");
                tryNumber = tryNumber + 13;
                System.out.println("Число игрока = " + tryNumber);
            } else if (tryNumber > secretNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
                tryNumber = tryNumber - 15;
                System.out.println("Число игрока = " + tryNumber);
            }
        } while (tryNumber != secretNumber);
        System.out.println("Поздравляю, число угадано!");
    }
}