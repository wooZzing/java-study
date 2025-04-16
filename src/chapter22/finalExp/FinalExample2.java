package chapter22.finalExp;

public class FinalExample2 {
    public static void main(String[] args) {
        final int max = 100;
        System.out.println("최댓값: " + max);

        // max = 200; // ❌ 에러! final 변수는 한 번만 할당 가능
    }
}