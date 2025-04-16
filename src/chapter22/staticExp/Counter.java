package chapter22.staticExp;

public class Counter {
    public static int count = 0; // 모든 객체가 공유함

    public Counter() {
        count++;
    }
}