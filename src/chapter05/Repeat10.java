package chapter05;

public class Repeat10 {
    public static void main(String[] args) {
        int sum = 0;// 합계를 저장 할 변수를 0으로 초기화 합니다.

        int i = 1; // 반복문에 사용할 카운트 변수 i를 초기화 합니다.

        // 1부터 10까지 합계를 구합니다.
        while (i <= 10) {
            sum += i;   // sum 변수에 i의 값을 더합니다.
            i++; // i의 값을 1 증가시킵니다.
        }

        System.out.print(sum); // sum의 값을 출력합니다.
    }
}