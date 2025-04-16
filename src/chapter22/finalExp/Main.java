package chapter22.finalExp;

public class Main {
    public static void main(String[] args) {
        System.out.println("PI 값 : " + FinalExample1.PI);
        System.out.println("앱 이름 : " + FinalExample1.APP_NAME);

        // FinalExample1.PI = 3.0; // ❌ 컴파일 에러! final 변수는 변경 불가
    }
}