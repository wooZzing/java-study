package chapter20;

class Child2 extends Parent2 {
    String name = "자식";

    public void printNames() {
        System.out.println("this.name = " + this.name);    // 자식
        System.out.println("super.name = " + super.name);  // 부모
    }
}