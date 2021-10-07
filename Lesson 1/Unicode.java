public class Unicode {
    public static void main(String[] args) {
        char unicode = 33;
        int count = unicode;
        do {
            System.out.println("Unicode " + count + " = " + unicode);
            unicode++;
            count = unicode;
        } while (count <= 126);
    }
}