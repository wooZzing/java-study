package chapter03;

public class Operater01 {
    public static void main(String[] args) {
        int a = 5, b = -10;

        System.out.print("a = " + a);
        System.out.print(", b = " + b);
        System.out.println();

        // 단항 플러스 연산자: 변수의 값을 변경하지 않음
        System.out.println("+a: " + (+a)); // 5

        // 단항 마이너스 연산자: 변수의 부호를 반전시킴
        System.out.println("-a: " + (-a)); // -5
        System.out.println("-b: " + (-b)); // 10

        // 전위 증가 연산자: 변수의 값을 1 증가시킴
        System.out.println("++a 전: " + a); // 5
        System.out.println("++a 후: " + (++a)); // 6

        // 전위 감소 연산자: 변수의 값을 1 감소시킴
        System.out.println("--a 전: " + a); // 6
        System.out.println("--a 후: " + (--a)); // 5

        // 후위 증가 연산자: 표현식 평가 후 변수의 값을 1 증가시킴
        System.out.println("a++ 전: " + a); // 5
        System.out.println("a++ 중: " + (a++)); // 5
        System.out.println("a++ 후: " + a); // 6

        // 후위 감소 연산자: 표현식 평가 후 변수의 값을 1 감소시킴
        System.out.println("a-- 전: " + a); // 6
        System.out.println("a-- 중: " + (a--)); // 6
        System.out.println("a-- 후: " + a); // 5
    }
}
