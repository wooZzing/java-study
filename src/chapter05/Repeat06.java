package chapter05;

public class Repeat06 {
    public static void main(String[] args) {
        int sum = 0;    // 합계를 저장 할 변수를 0으로 초기화 합니다.

        // 1부터 10까지 반복문을 실행합니다.
        for(int i = 1; i <= 10 ; i++) {
            sum += i;   // sum 변수에 i의 값을 더합니다.
        }

        System.out.println(sum);    // 합계를 출력합니다.
    }
}