package chapter23;

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    public void sniff() {
        System.out.println("개가 냄새를 맡습니다.");
    }
}