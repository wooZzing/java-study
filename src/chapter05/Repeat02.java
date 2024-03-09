package chapter05;

public class Repeat02 {
    public static void main(String[] args) {
        int i = 0;  // 반복문의 조건 검사에서 사용할 변수를 초기화합니다.

        for( ; ; i++) {
            System.out.print(i + " ");  // i의 값을 출력합니다.

            // 조건 검사가 없는 for문은 무한 반복하므로 if문으로 반드시 break문을 실행해줘야 합니다.
            if(i == 4)
                break;
        }
        System.out.println();

        System.out.println("반복문이 종료되었습니다.");
    }
}