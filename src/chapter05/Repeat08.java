package chapter05;

import java.util.Scanner;

public class Repeat08 {
    public static void main(String[] args) {

        // Scanner 클래스를 이용하여 콘솔로부터 사용자 입력을 받을 수 있는 scanner 객체를 생성합니다.
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 입력받을 수를 저장할 input 변수를 선언합니다.
        int input;

        while(true) {
            System.out.println("10 ~ 100까지의 숫자를 입력해주세요.");
            // 사용자로부터 수를 입력받습니다.
            input = scanner.nextInt();

            // 10 ~ 100의 값을 입력할때까지 반복합니다.
            if(input >= 10 && input <= 100) {
                break;
            }
        }

        System.out.println("369 게임을 시작합니다!" + input + " 까지 진행합니다!");

        for(int i = 1; i <= input; i++) {
            // 줄바꿈을 합니다.
            System.out.println();

            // 현재 수를 문자열로 변환합니다.
            String numberStr = i + "";

            // 박수를 쳤는지 안쳤는지 확인하는 변수입니다.
            boolean isClap = false;

            // 문자열을 char형 배열로 변환하고 3, 6, 9에 해당하는지 확인합니다.
            for(char ch : numberStr.toCharArray()){
                if(ch == '3' || ch == '6' || ch == '9'){
                    isClap = true;
                    System.out.print("짝! ");
                }
            }

            // 박수 친 경우 숫자를 말하지 않습니다.
            if(isClap) {
                continue;
            }

            System.out.print(i);
        }
    }
}