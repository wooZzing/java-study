package chapter20;

class Child4 extends Parent4 {
    public Child4() {
        // 자바가 자동으로 super(); 를 호출합니다.
        System.out.println("자식 생성자");
    }
}