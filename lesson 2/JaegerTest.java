public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger();
        jaeger1.setModelName("Brawler Yukon");
        System.out.println(jaeger1.getModelName());

        jaeger1.setMark("Mark I");
        System.out.println(jaeger1.getMark());

        jaeger1.setOrigin("United States of America");
        System.out.println(jaeger1.getOrigin());

        jaeger1.drift();
        jaeger1.attack();

        Jaeger jaeger2 = new Jaeger();
        jaeger2.setModelName("Coyote Tango");
        System.out.println(jaeger2.getModelName());

        jaeger2.setMark("Mark I");
        System.out.println(jaeger2.getMark());

        jaeger2.setOrigin("Japan");
        System.out.println(jaeger2.getOrigin());

        jaeger2.drift();
        jaeger2.attack();

        jaeger1.setModelName("Horizon Brave");
        System.out.println(jaeger1.getModelName());

        jaeger1.setOrigin("China");
        System.out.println(jaeger1.getOrigin());

        jaeger1.drift();
        jaeger1.attack();
    }
}