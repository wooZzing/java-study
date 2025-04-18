package chapter27.abstractExp;

abstract class Animal {
    abstract void sound();  // 자식이 반드시 구현
    void breathe() {
        System.out.println("숨을 쉽니다.");
    }
}