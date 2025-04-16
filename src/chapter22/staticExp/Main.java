package chapter22.staticExp;

public class Main {
    public static void main(String[] args) {
        Counter con1 = new Counter();
        Counter con2 = new Counter();
        Counter con3 = new Counter();

        System.out.println("Counter.count : " + Counter.count);
        System.out.println("con1.count : " + con1.count);
        System.out.println("con2.count : " + con2.count);
        System.out.println("con3.count : " + con3.count);
    }
}