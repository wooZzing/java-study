package chapter05;

public class Repeat03 {
    public static void main(String[] args) {
        int i = 0;  // 반복문의 조건 검사에서 사용할 변수를 초기화합니다.

        for( ; ; ) {
            System.out.println(i);  // i의 값을 출력합니다.

            // 조건 검사가 없는 for문은 무한 반복하므로 if문으로 반드시 break문을 실행해줘야 합니다.
            if(i == 4)
                break;

            i++;  // 반복문을 탈출하기 위해 i의 값을 코드 내부에서 증가시킵니다.
        }

        System.out.println("반복문이 종료되었습니다.");
    }
}