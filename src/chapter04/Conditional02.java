package chapter04;

public class Conditional02 {
    public static void main(String[] args) {
        int score = 65; // 사용자의 점수

        // 점수가 70점 초과인지 검사
        if (score > 70) {
            // 조건이 참(true)일 경우 실행될 코드
            System.out.println("합격입니다.");
        } else {
            // 조건이 거짓(false)일 경우 실행될 코드
            System.out.println("불합격입니다.");
        }
    }
}
