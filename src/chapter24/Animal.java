package chapter24;

abstract class Animal {
    // 추상 메서드 (몸체 없음)
    public abstract void sound();

    // 일반 메서드
    public void breathe() {
        System.out.println("숨을 쉽니다.");
    }
}