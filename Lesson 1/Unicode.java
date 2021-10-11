public class Unicode {
    public static void main(String[] args) {
        char unicode = 33;
        for (int count = 33; count <= 126; count++) {
            System.out.println("Unicode " + count + " = " + unicode++);
        }
    }
}