package chapter05;

public class Repeat11 {
    public static void main(String[] args) {
        int i = 2; // 반복문에 사용할 카운트 변수 i를 초기화 합니다.

        // 2부터 10까지 반복문을 실행합니다.
        while (i <= 10) {
            System.out.print(i + " "); // i의 값을 출력합니다.
            i += 2; // i의 값을 2씩 증가합니다.
        }
    }
}