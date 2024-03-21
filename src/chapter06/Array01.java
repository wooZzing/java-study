package chapter06;


import java.util.*;

public class Array01 {
    public static void main(String[] args) {
        // 성적 배열을 선언, 생성, 초기화합니다.
        char[] gradeArray = {'A', 'B', 'C', 'D', 'F'};

        System.out.println("점수를 입력해주세요.");

        // Scanner 클래스를 이용하여 콘솔로부터 사용자 입력을 받을 수 있는 scanner 객체를 생성합니다.
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 점수를 정수형으로 입력받습니다.
        while(true) {
            // 사용자로부터 점수를 정수형으로 입력받습니다.
            int score = scanner.nextInt();

            // 입력한 점수에 해당하는 성적을 저장할 변수입니다.
            char grade;

            // 입력받은 점수에 따라 성적 배열에 인덱스로 접근합니다. 점수가 -1 인 경우 프로그램을 종료합니다.
            if(score >= 90) {
                grade = gradeArray[0];
            } else if(score >= 80) {
                grade = gradeArray[1];
            } else if(score >= 70) {
                grade = gradeArray[2];
            } else if(score >= 60) {
                grade = gradeArray[3];
            } else if(score > -1) {
                grade = gradeArray[4];
            } else {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.println("입력하신 점수의 성적은 " + grade + "입니다.");
        }
    }
}