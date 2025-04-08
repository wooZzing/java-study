package chapter16;

public class Person {
    String name;
    int age;

    // 모든 생성자가 이 생성자를 재사용
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 기본 생성자
    public Person() {
        this("이름없음", 0);  // 아래 생성자 호출
    }

    // 이름만 받는 생성자
    public Person(String name) {
        this(name, 0);  // 아래 생성자 호출
    }

    public void introduce() {
        System.out.println("이름: " + name + ", 나이: " + age);
    }

    public static void main(String[] args) {
        new Person().introduce();             // 이름없음, 0
        new Person("지민").introduce();        // 지민, 0
        new Person("영수", 25).introduce();    // 영수, 25
    }
}