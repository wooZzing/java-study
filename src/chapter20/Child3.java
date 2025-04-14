package chapter20;

class Child3 extends Parent3 {
    public Child3() {
        super("홍길동");  // 부모 생성자 명시적으로 호출
        System.out.println("자식 생성자");
    }
}