package chapter20;

class Child1 extends Parent1 {
    public Child1() {
        super("Hello!");  // 부모 생성자 호출
        System.out.println("자식 생성자 실행");
    }
}