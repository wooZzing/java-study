package chapter16;

public class Student {
    String name;

    // 생성자
    public Student(String name) {
        this.name = name; // 멤버변수 = 매개변수
    }

    public void introduce() {
        System.out.println("제 이름은 " + this.name + "입니다.");
    }

    public static void main(String[] args) {
        Student s = new Student("우징");
        s.introduce();
    }
}