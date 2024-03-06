package chapter04;

public class Conditional03 {
    public static void main(String[] args) {
        int score = 75; // 사용자의 점수
        char grade = ' '; // 사용자의 등급 (공백 문자로 초기화)

        // 점수에 따른 등급 부여
        if (score >= 90) {
            // 90점 이상인 경우
            grade = 'A';
        } else if (score >= 80) {
            // 90점 미만이고 80점 이상인 경우
            grade = 'B';
        } else if (score >= 70) {
            // 80점 미만이고 70점 이상인 경우
            grade = 'C';
        } else if (score >= 60) {
            // 70점 미만이고 60점 이상인 경우
            grade = 'D';
        } else {
            // 모든 조건이 거짓(false)일 경우, 즉 60점 미만인 경우 실행될 코드
            grade = 'f';
        }

        System.out.println("해당 사용자는 " + grade + " 등급입니다.");
    }
}
