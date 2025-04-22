package chapter31.throwExp;

public class ThrowExample1 {
    public static void main(String[] args) {
        int age = -1;

        if (age < 0) {
            throw new IllegalArgumentException("나이는 0보다 작을 수 없습니다.");
        }

        System.out.println("정상 처리");
    }
}