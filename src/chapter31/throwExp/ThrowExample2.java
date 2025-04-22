package chapter31.throwExp;

public class ThrowExample2 {
    public static void main(String[] args) {
        int age = -1;

        try {
            if (age < 0) {
                throw new IllegalArgumentException("나이는 0보다 작을 수 없습니다.");
            }

            System.out.println("정상 처리");
        } catch (IllegalArgumentException e) {
            System.out.println("예외 발생! 메시지: " + e.getMessage());
        }

        System.out.println("프로그램이 계속 실행됩니다.");
    }
}