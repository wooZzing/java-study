package chapter20;

class Child5 extends Parent5 {
    public Child5() {
        // super(); ❌ 기본 생성자가 없어서 자동 호출 불가
        super("홍길동"); // ⭕ 명시적으로 호출해야 함!
        System.out.println("자식 생성자");
    }
}