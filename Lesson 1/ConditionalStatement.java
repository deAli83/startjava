public class ConditionalStatement {
    public static void main(String[] args) {
        byte age = 43;
        char sex = 'x';
        short height =183;
        char firstlettername = 'N';
        
        
        if (age > 20) {
            System.out.println("Пошел третий десяток");
        }
    
        if (sex == 'm') {
            System.out.println("Мужчина");
        }

        if (sex != 'm') {
            System.out.println("Женщина");
        }

        if (height < 180) {
            System.out.println("Рост ниже среднего");
        } else {
            System.out.println("Рост высокий");
        }

        if (firstlettername == 'M') {
            System.out.println("Имя начинается на М");
        } else if(firstlettername == 'I') {
            System.out.println("Имя начинается на I");
        } else {
            System.out.println("Первая буква имени неизвестна");
        }
    }
}