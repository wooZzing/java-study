package chapter06;

import java.util.*;

public class Array04 {
    public static void main(String[] args) {
        // Scanner 클래스를 이용하여 콘솔로부터 사용자 입력을 받을 수 있는 scanner 객체를 생성합니다.
        Scanner scanner = new Scanner(System.in);

        // 특정범위의 난수를 생성하기위해 Random클래스를 사용합니다.
        Random random = new Random();

        // 컴퓨터가 생각한 숫자를 저장할 배열을 생성합니다.
        int[] randomArray = new int[3];

        // 컴퓨터 숫자 설정 : 각 자리 숫자는 중복되지 않도록 설정합니다.
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(9) + 1; // 1~9 사이의 숫자를 생성합니다.
            for (int j = 0; j < i; j++) {
                if (randomArray[i] == randomArray[j]) {
                    i--; // 중복 숫자 발생 시, 다시 숫자를 생성합니다.
                    break;
                }
            }
        }

        // 실행 횟수를 기록할 변수를 초기화합니다.
        int count = 0;

        while (true) {
            int strike = 0;
            int ball = 0;

            // 사용자로부터 3자리 숫자 입력을 받습니다.
            System.out.println("3자리 숫자를 입력하세요: ");
            int guess = scanner.nextInt();
            int[] userNumbers = {(guess / 100) % 10, (guess / 10) % 10, guess % 10};

            /*
                스트라이크와 볼을 판정합니다.
                스트라이크 : 3자리의 숫자중 자릿수와 숫자 모두 맞을 경우 1 스트라이크 입니다.
                볼 : 3자리의 숫자중 숫자만 맞을 경우 1 볼 입니다.
                Ex) 컴퓨터가 생성한 임의의 수가 369이고, 사용자가 139를 입력하면 1 스트라이크 1볼 입니다. (3은 숫자만 맞고, 9는 자릿수까지 맞으므로)
             */
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (userNumbers[i] == randomArray[j]) {
                        if (i == j) {
                            strike++;
                        } else {
                            ball++;
                        }
                    }
                }
            }

            System.out.println("결과 : " + strike + " 스트라이크, " + ball + " 볼");

            // 실행 횟수를 기록합니다.
            count++;

            // 숫자를 모두 맞출 경우 반복문을 종료합니다.
            if (strike == 3) {
                System.out.println("축하합니다! " + count + "번 만에 맞추셨습니다.");
                break;
            }
        }
        scanner.close();
    }
}