package chapter20;

class Child7 extends Parent7 {
    public Child7() {
        this("기본값"); // 자기 자신의 다른 생성자 호출
    }

    public Child7(String msg) {
        super("From Child: " + msg); // 부모 생성자 호출
    }
}