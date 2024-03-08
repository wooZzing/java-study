package chapter05;

public class Repeat06 {
    public static void main(String[] args) {
        System.out.println("==for 반복문==");
        int sum = 0;    // 합계를 저장 할 변수를 0으로 초기화 합니다.

        // 1부터 10까지 반복문을 실행합니다.
        for(int i = 1; i <= 10 ; i++) {
            sum += i;   // sum 변수에 i의 값을 더합니다.
        }

        System.out.println(sum);    // 합계를 출력합니다.

        System.out.println("==while 반복문==");
        int sum2 = 0;// 합계를 저장 할 변수를 0으로 초기화 합니다.

        int i = 1; // 반복문에 사용할 카운트 변수 i를 초기화 합니다.

        // 1부터 10까지 합계를 구합니다.
        while (i <= 10) {
            sum2 += i;   // sum 변수에 i의 값을 더합니다.
            i++; // i의 값을 1 증가시킵니다.
        }

        System.out.print(sum2); // sum의 값을 출력합니다.
    }
}