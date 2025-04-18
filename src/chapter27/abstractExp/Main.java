package chapter27.abstractExp;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();  // 업캐스팅
        dog.sound();
        dog.breathe();
    }
}