package chapter29.finalExp;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("파일 읽는 중...");
            throw new RuntimeException("가짜 에러!");
        } catch (RuntimeException e) {
            System.out.println("예외 발생!");
        } finally {
            System.out.println("무조건 실행되는 finally 블록");
        }
    }
}