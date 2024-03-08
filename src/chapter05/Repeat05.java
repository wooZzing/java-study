package chapter05;

public class Repeat05 {
    public static void main(String[] args) {
        System.out.println("==for 반복문==");
        // 10부터 1까지 반복문을 실행합니다.
        for(int i = 10; i >= 1 ; i--) {
            System.out.print(i + " ");  // i의 값을 출력합니다.
        }

        System.out.println();

        System.out.println("==while 반복문==");
        int i = 10; // 반복문에 사용할 카운트 변수 i를 초기화 합니다.

        // 10부터 1까지 반복문을 실행합니다.
        while (i >= 1) {
            System.out.print(i + " "); // i의 값을 출력합니다.
            i--; // i의 값을 1 감소시킵니다.
        }
    }
}