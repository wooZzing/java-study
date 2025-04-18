package chapter25;

abstract class Animal {
    abstract void sound();   // 추상 메서드 ➡ 자식이 반드시 구현해야함

    public void breathe() {
        System.out.println("숨을 쉽니다.");
    }
}