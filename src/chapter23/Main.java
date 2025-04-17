package chapter23;

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Dog();   // 업캐스팅
        Animal a2 = new Cat();   // 업캐스팅

        a1.sound();
        a2.sound();

        System.out.println("makeSound 호출");

        makeSound(new Dog());
        makeSound(new Cat());
    }

    public static void makeSound(Animal animal) {
        animal.sound();  // 실제 객체 기준으로 동작
    }
}