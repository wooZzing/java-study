package chapter21;

public class PrivateExp {
    private String name = "홍길동";

    public void printName() {
        System.out.println(name);  // ⭕ 클래스 내부에서는 접근 가능
    }
}