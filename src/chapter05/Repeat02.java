package chapter05;

import java.util.Scanner;

public class Repeat02 {
    public static void main(String[] args) {

        int sum = 0; // 입력받은 정수의 총합을 저장할 변수를 선언 및 초기화합니다.

        System.out.println("덧셈을 진행할 정수를 입력해주세요. 종료하려면 0번을 입력해주세요.");

        // Scanner 클래스를 이용하여 콘솔로부터 사용자 입력을 받을 수 있는 scanner 객체를 생성합니다.
        Scanner scanner = new Scanner(System.in);

        while(true) {
            // 사용자로부터 정수를 입력받습니다.
            int number = scanner.nextInt();

            // 입력받은 수가 0일 경우 while문을 종료합니다. 아닐 경우 총합 변수에 더합니다.
            if(number == 0)
                break;
            else
                sum += number;
        }

        System.out.println("입력한 수의 총 합은 " + sum + " 입니다.");
    }
}