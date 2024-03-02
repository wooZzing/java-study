package Chapter03;

public class Operater03 {
    public static void main(String[] args) {
        int a = 10, b = 5;
        double c = 10.0, d = 10.0;

        System.out.print("a = " + a);
        System.out.print(", b = " + b);
        System.out.print(", c = " + c);
        System.out.print(", d = " + d);
        System.out.println();

        // 비교 연산(같음)
        System.out.println("a == b: " + (a == b)); // false
        System.out.println("c == d: " + (c == d)); // true

        // 비교 연산(같지 않음)
        System.out.println("a != b: " + (a != b)); // true
        System.out.println("c != d: " + (c != d)); // false

        // 크다 비교 연산
        System.out.println("a > b: " + (a > b)); // true

        // 작다 비교 연산
        System.out.println("a < b: " + (a < b)); // false

        // 크거나 같다 비교 연산
        System.out.println("a >= b: " + (a >= b)); // true
        System.out.println("c >= d: " + (c >= d)); // true (c와 d가 같으므로 크거나 같음)

        // 작거나 같다 비교 연산
        System.out.println("a <= b: " + (a <= b)); // false
        System.out.println("c <= d: " + (c <= d)); // true (c와 d가 같으므로 작거나 같음)
    }
}
