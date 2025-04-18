package chapter27.interfaceExp;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();  // 인터페이스 타입으로 구현체 참조
        dog.sound();
    }
}