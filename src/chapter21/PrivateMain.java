package chapter21;

public class PrivateMain {
    public static void main(String[] args) {
        PrivateExp p = new PrivateExp();
        // System.out.println(p.name);  // ❌ private이라서 접근 불가
    }
}