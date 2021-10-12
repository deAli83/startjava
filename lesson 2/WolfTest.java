public class WolfTest {
    public static void main(String[] args) {
        Wolf grey = new Wolf();
        grey.sex = "male";
        grey.name = "Серый";
        grey.weight = 10;
        grey.age = 3;
        grey.colour = "grey";

        System.out.println("Пол = " + grey.sex);
        System.out.println("Кличка = " + grey.name);
        System.out.println("Вес = " + grey.weight);
        System.out.println("Возраст = " + grey.age);
        System.out.println("Окрас = " + grey.colour);

        grey.move();
        grey.sit();
        grey.run();
        grey.howl();
        grey.hunt();
    }
}