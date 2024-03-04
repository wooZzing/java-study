package Chapter03;

public class Operater02 {
    public static void main(String[] args) {
        int a = 10, b = 4;
        double c = 10.0, d = 4.0;

        System.out.print("a = " + a);
        System.out.print(", b = " + b);
        System.out.print(", c = " + c);
        System.out.print(", d = " + d);
        System.out.println();

        // 더하기 연산
        System.out.println("a + b = " + (a + b)); // 14

        // 빼기 연산
        System.out.println("a - b = " + (a - b)); // 6

        // 곱하기 연산
        System.out.println("a * b = " + (a * b)); // 40

        // 나누기 연산
        System.out.println("a / b = " + (a / b)); // 2 (정수 나누기 정수 결과는 정수)
        System.out.println("c / d = " + (c / d)); // 2.5 (실수 나누기 실수 결과는 실수)

        // 나머지 연산
        System.out.println("a % b = " + (a % b)); // 2

        // 복잡한 표현식
        System.out.println("a + b * 3 = " + (a + b * 3)); // 22
        System.out.println("(a + b) * 3 = " + ((a + b) * 3)); // 42
    }
}
