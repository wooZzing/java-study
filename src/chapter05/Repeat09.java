package chapter05;

public class Repeat09 {
    public static void main(String[] args) {
        int i = 10; // 반복문에 사용할 카운트 변수 i를 초기화 합니다.

        // 10부터 1까지 반복문을 실행합니다.
        while (i >= 1) {
            System.out.print(i + " "); // i의 값을 출력합니다.
            i--; // i의 값을 1 감소시킵니다.
        }
    }
}