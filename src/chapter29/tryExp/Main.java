package chapter29.tryExp;

public class Main {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println("결과: " + result);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다!");
        }

        System.out.println("프로그램이 멈추지 않았습니다.");
    }
}