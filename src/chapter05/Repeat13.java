package chapter05;

public class Repeat13 {
    public static void main(String[] args) {
        int i = 1; // 반복문에 사용할 카운트 변수 i를 초기화 합니다.

        // 1부터 10까지 반복문을 실행합니다.
        do {
            System.out.print(i + " "); // i의 값을 출력합니다.
            i++; // i의 값을 1 증가시킵니다.
        } while (i <= 10); // i의 값이 10 이하라면 다시 do를 실행합니다.
    }
}
