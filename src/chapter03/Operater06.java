package chapter03;

public class Operater06 {
    public static void main(String[] args) {
        int a = 12; // 이진수로 1100
        int b = 5;  // 이진수로 0101
        System.out.print("a = " + a);
        System.out.print(", b = " + b);
        System.out.println();


        // 비트 AND 연산
        int andResult = a & b; // 1100 AND 0101 = 0100, 결과는 4
        System.out.println("a & b = " + andResult);

        // 비트 OR 연산
        int orResult = a | b; // 1100 OR 0101 = 1101, 결과는 13
        System.out.println("a | b = " + orResult);

        // 비트 XOR 연산
        int xorResult = a ^ b; // 1100 XOR 0101 = 1001, 결과는 9
        System.out.println("a ^ b = " + xorResult);

        // 비트 NOT 연산
        int notResult = ~a; // NOT 1100 = 0011 (실제 결과는 정수의 보수를 구하기 때문에, 결과는 a의 보수)
        System.out.println("~a = " + notResult);

        // 비트 왼쪽 시프트 연산
        int leftShift = a << 2; // 1100을 왼쪽으로 2비트 이동 = 110000, 결과는 48
        System.out.println("a << 2 = " + leftShift);

        // 비트 오른쪽 시프트 연산
        int rightShift = a >> 2; // 1100을 오른쪽으로 2비트 이동 = 0011, 결과는 3
        System.out.println("a >> 2 = " + rightShift);
    }
}
