package chapter24;

class Dog extends Animal {
    // 추상 메서드를 반드시 구현해야 함
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}