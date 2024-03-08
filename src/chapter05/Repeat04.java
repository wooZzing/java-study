package chapter05;

public class Repeat04 {
    public static void main(String[] args) {
        System.out.println("==for 반복문==");
        // 1부터 10까지 반복문을 실행합니다.
        for(int i = 1; i <= 10 ; i++) {
            System.out.print(i + " ");  // i의 값을 출력합니다.
        }
        System.out.println();

        System.out.println("==while 반복문==");
        int i = 1; // 반복문에 사용할 카운트 변수 i를 초기화 합니다.

        // 1부터 10까지 반복문을 실행합니다.
        while (i <= 10) {
            System.out.print(i + " "); // i의 값을 출력합니다.
            i++; // i의 값을 1 증가시킵니다.
        }
    }
}