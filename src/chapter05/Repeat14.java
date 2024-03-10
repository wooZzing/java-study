package chapter05;

import java.util.Scanner;

public class Repeat14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner 객체 생성(사용자로부터 입력 받을 수 있는 클래스)
        int choice;

        do {
            System.out.println("1번부터 5번사이의 번호를 입력해주세요. 종료하려면 0번을 입력해주세요.");
            choice = scanner.nextInt(); // 사용자로부터 번호 입력 받기

            if (choice == 0) {
                System.out.println("프로그램을 종료합니다.");
                break; // 0번 입력 시 반복 종료
            } else if (choice < 1 || choice > 5) {
                System.out.println("잘못된 번호를 선택했습니다. 다시 입력해주세요.");
                // 잘못된 입력에 대한 메시지 출력 후, 반복문 계속
            } else {
                System.out.println("선택한 번호는 " + choice + "번 입니다.");
                // 유효한 입력(1~5)에 대한 처리
            }
        } while (true); // 무한 반복, 조건에 맞는 break문으로 종료 제어

        scanner.close(); // Scanner 객체 닫기
    }
}
