package chapter11;

// Method 클래스 생성
public class Method {
    // add 메서드 생성
    public int add(int a, int b) {
        return a + b;
    }

    // out 메서드 생성
    public void out(int num) {
        System.out.println(num);
    }

    // sqrtOut 메서드 생성 (제곱 메서드)
    public static void sqrtOut(int num) {
        System.out.println(num * num);
    }
}
