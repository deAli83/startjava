public class ConditionalStatement {
    public static void main(String[] args) {
        byte age = 43;
        if (age > 20) {
            System.out.println("Пошел третий десяток");
        }

        boolean male = true;
        if (male) {
            System.out.println("Мужчина");
        } else {
            System.out.println("Женщина");
        }

        short height = 183;
        if (height < 180) {
            System.out.println("Рост ниже среднего");
        } else {
            System.out.println("Рост высокий");
        }

        char firstLetterName = 'N';
        if (firstLetterName == 'M') {
            System.out.println("Имя начинается на М");
        } else if(firstLetterName == 'I') {
            System.out.println("Имя начинается на I");
        } else {
            System.out.println("Первая буква имени неизвестна");
        }
    }
}