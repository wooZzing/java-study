package chapter17;

public class Chapter17Main {
    public static void main(String[] args) {
        Dog dog = new Dog();   // Dog 객체 생성

        dog.name = "바둑이";    // 부모 클래스의 변수 사용
        System.out.println("이름: " + dog.name);

        dog.eat();             // 부모 클래스의 메서드 사용
        dog.sleep();           // 부모 클래스의 메서드 사용
        dog.bark();            // 자식 클래스 고유 메서드 사용
    }
}
