package chapter22.abstractExp;

abstract class Animal {
    public abstract void sound(); // 추상 메서드

    public void sleep() {
        System.out.println("쿨쿨 잡니다...");
    }
}