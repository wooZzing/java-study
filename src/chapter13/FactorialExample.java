package chapter13;

public class FactorialExample {

    public static int factorial(int n) {
        if (n == 1) {                // 종료 조건
            return 1;
        }

        return n * factorial(n - 1); // 재귀 호출
    }

    public static void main(String[] args) {
        int result = factorial(5);
        System.out.println("5! = " + result);
    }
}