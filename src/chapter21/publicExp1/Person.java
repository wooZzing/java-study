package chapter21.publicExp1;

public class Person {

    public String name = "홍길동";  // 누구나 접근 가능한 변수

    public void introduce() {     // 외부에서도 호출 가능한 메서드
        System.out.println("안녕하세요, 제 이름은 " + name + "입니다.");
    }
}