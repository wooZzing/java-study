package chapter05;

import java.util.Scanner;

public class Repeat03 {
    public static void main(String[] args) {

        // Scanner 클래스를 이용하여 콘솔로부터 사용자 입력을 받을 수 있는 scanner 객체를 생성합니다.
        Scanner scanner = new Scanner(System.in);

        // 설정된 비밀번호를 선언 및 초기화 합니다.
        String password = "wooZzing";

        // 사용자로부터 입력 받은 비밀번호를 저장할 변수를 선언합니다.
        String input;

        do {
            System.out.println("비밀번호를 입력하세요: ");
            input = scanner.nextLine(); // newxtLine()은 한 줄의 문자열 입력을 읽습니다.

            // equals()은 객체의 내용을 비교합니다.
            if (!input.equals(password)) {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
            }
        } while (!input.equals(password));

        System.out.println("비밀번호 확인 완료.");
    }
}