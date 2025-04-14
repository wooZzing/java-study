package chapter20;

class Child6 extends Parent6 {
    String name = "자식";

    void sayHello() {
        System.out.println("자식 인사: Hello!");
    }

    void showInfo() {
        System.out.println("this.name = " + this.name);   // 자식 name
        System.out.println("super.name = " + super.name); // 부모 name

        this.sayHello();   // 자식 메서드
        super.sayHello();  // 부모 메서드
    }
}