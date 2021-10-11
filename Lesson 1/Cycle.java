public class Cycle {
    public static void main(String[] args) {
        System.out.println("Числа от 0 до 20");
        for (byte i = 0; i <= 20; i++) {
            System.out.println(i);
        }
        
        System.out.println("Числа от-6 до 6 с дискретностью 2");
        byte i = -6;
        while (i <= 6) {
            System.out.println(i);
            i += 2;
        }

        i = 10;
        int sumOdd = 0;
        do {
            if (i % 2 == 0) {
                sumOdd += i;
            }
            i++;
        } while (i <= 20);
        System.out.println("Сумма нечетных чисел от 10 до 20 = " + sumOdd);
    }
}