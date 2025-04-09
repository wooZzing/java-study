package chapter19;

public class OverloadingMain {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(1, 2);            // 2개 정수 더함
        c.add(1.0, 2.0);        // 실수 더함
        c.add(1, 2, 3);      // 3개 정수 더함
    }
}