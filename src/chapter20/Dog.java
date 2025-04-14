package chapter20;

class Dog extends Animal {
    @Override
    public void sound() {
        super.sound(); // 부모의 sound() 호출
        System.out.println("멍멍!");
    }
}