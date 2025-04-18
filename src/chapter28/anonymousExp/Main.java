package chapter28.anonymousExp;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal() {
            @Override
            void sound() {
                System.out.println("멍멍");
            }
        };

        dog.sound();
    }
}