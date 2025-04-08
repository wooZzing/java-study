package chapter15;

public class Person {
    String name;
    int age;

    // 생성자 정의
    public Person() {
        name = "홍길동";
        age = 20;
        System.out.println("생성자 호출됨!");
    }

    public void introduce() {
        System.out.println("이름: " + name + ", 나이: " + age);
    }

    public static void main(String[] args) {
        Person p1 = new Person();  // 생성자 자동 호출
        p1.introduce();  // 출력: 이름: 홍길동, 나이: 20
    }
}