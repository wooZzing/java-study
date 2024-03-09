package chapter05;

public class Repeat01 {
    public static void main(String[] args) {
        int i = 0;  // 반복문의 조건 검사에서 사용할 변수를 초기화합니다.

        for( ; i < 5; i++) {
            System.out.print(i + " ");	// i의 값을 출력합니다.
        }
        System.out.println();

        System.out.println("반복문이 종료되었습니다.");
    }
}