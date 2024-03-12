package chapter05;

import java.util.Scanner;

public class Repeat06 {
    public static void main(String[] args) {

        // Scanner 클래스를 이용하여 콘솔로부터 사용자 입력을 받을 수 있는 scanner 객체를 생성합니다.
        Scanner scanner = new Scanner(System.in);

        // Math 클래스의 random메서드를 통해 1 ~ 100의 수를 임의로 생성합니다.
        int number = (int) (Math.random() * 100) + 1;
        // 사용자로부터 입력받을 수를 저장할 input 변수를 선언합니다.
        int input;
        System.out.println("up & down 게임을 시작합니다! 생성된 숫자를 맞춰주세요.");

        while(true) {
            // 사용자로부터 수를 입력받습니다.
            input = scanner.nextInt();

            if(number == input) {
                System.out.println("정답입니다~ 생성된 숫자는 " + number + "입니다!");
                break;
            }

            if(number > input){
                System.out.println("up!");
            } else {
                System.out.println("down!");
            }
        }
    }
}