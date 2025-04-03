package chapter12;

public class MathUtilMain {
    public static void main(String[] args) {
        int result = MathUtil.square(5);       // 25
        double pi = MathUtil.getPi();          // 3.14159

        System.out.println("5의 제곱: " + result);
        System.out.println("파이 값: " + pi);
    }
}
