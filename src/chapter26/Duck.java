package chapter26;

class Duck implements Flyable, Swimmable {
    public void fly() {
        System.out.println("오리가 납니다");
    }

    public void swim() {
        System.out.println("오리가 헤엄칩니다");
    }
}