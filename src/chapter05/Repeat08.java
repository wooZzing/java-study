package chapter05;

public class Repeat08 {
    public static void main(String[] args) {
        int count = 0; // 반복문에 사용할 카운트 변수 i를 초기화 합니다.

        // 0부터 4까지 숫자가 출력되고 반복이 종료됩니다.(조건은 무한반복)
        while (true) {
            if (count == 5)
                break; // count가 5에 도달하면 반복을 종료합니다.

            System.out.print(count + " ");
            count++; // i의 값을 1 증가시킵니다.
        }
    }
}
