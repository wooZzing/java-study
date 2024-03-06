package chapter03;

public class Operater04 {
    public static void main(String[] args) {
        boolean c1 = true;
        boolean c2 = false;

        System.out.print("c1 = " + c1);
        System.out.print(", c2 = " + c2);
        System.out.println();

        // AND 연산 (&&): 모든 조건이 참이어야 전체가 참(true)
        System.out.println("c1 && c2: " + (c1 && c2)); // false

        // OR 연산 (||): 하나 이상의 조건이 참이면 전체가 참(true)
        System.out.println("c1 || c2: " + (c1 || c2)); // true

        // NOT 연산 (!): 조건의 참/거짓을 반전
        System.out.println("!c1: " + (!c1)); // false
        System.out.println("!c2: " + (!c2)); // true

        System.out.println("=========================");

        // 복합적인 사용 예
        int a = 10, b = 20;
        boolean result;

        System.out.print("a = " + a);
        System.out.print(", b = " + b);
        System.out.println();

        // a가 b보다 작고(b > a), a가 10과 같은 경우에만 참(true)
        result = (b > a) && (a == 10);
        System.out.println("(b > a) && (a == 10): " + result); // true

        // a가 b보다 크거나(a > b), b가 20과 같은 경우에 참(true)
        result = (a > b) || (b == 20);
        System.out.println("(a > b) || (b == 20): " + result); // true

        // NOT 연산을 사용하여 조건의 결과를 반전
        result = !((a < b) && (b == 20));
        System.out.println("!((a < b) && (b == 20)): " + result); // false
    }
}
