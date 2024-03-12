package chapter05;

import java.util.Scanner;

public class Repeat09 {
    public static void main(String[] args) {

        // Scanner 클래스를 이용하여 콘솔로부터 사용자 입력을 받을 수 있는 scanner 객체를 생성합니다.
        Scanner scanner = new Scanner(System.in);

        // 체스판의 크기를 저장할 상수 BOARD 변수를 선언합니다.
        final int BOARD;

        while(true) {
            System.out.println("1 ~ 9까지의 숫자를 입력해주세요.");
            // 사용자로부터 수를 입력받습니다.
            int temp = scanner.nextInt();

            // 1 ~ 9의 값을 입력할때까지 반복합니다.
            if(temp >= 1 && temp <= 9) {
                BOARD = temp;
                break;
            }
        }

        System.out.println(BOARD + " * " + BOARD + "크기의 체스보드판을 생성합니다.");

        for(int i = 1; i <= BOARD; i++) {  // 행을 순회하는 외부 반복문
            for(int j = 1; j <= BOARD; j++) {  // 열을 순회하는 내부 반복문
                // 행과 열의 합이 짝수인 경우 흰색('□'), 홀수인 경우 검은색('■')으로 판단합니다.
                if ((i + j) % 2 == 0) {
                    System.out.print("□ "); // 흰색 칸 출력
                } else {
                    System.out.print("■ "); // 검은색 칸 출력
                }
            }

            System.out.println(); // 한 행의 출력이 끝나면 개행하여 다음 행을 준비합니다.
        }
    }
}