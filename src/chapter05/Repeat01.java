package chapter05;

import java.util.Scanner;

public class Repeat01 {
    public static void main(String[] args) {

        System.out.println("출력할 구구단의 단수를 입력해주세요.");

        // Scanner 클래스를 이용하여 콘솔로부터 사용자 입력을 받을 수 있는 scanner 객체를 생성합니다.
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 단수를 정수형으로 입력받습니다.
        int number = scanner.nextInt();

        // 입력받은 단수가 2이상 9이하일때, 해당 단수의 구구단을 출력합니다.
        if(number >= 2 && number <= 9) {
            for (int i = 1; i <= 9; i++) {
                System.out.println(number + " * " + i + " = " + (number * i));
            }
        } else {
            System.out.println("잘못된 단수입니다.");
        }
    }
}