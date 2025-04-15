package chapter21.publicExp2;

import chapter21.publicExp1.Person;

public class PublicMain {
    public static void main(String[] args) {
        Person p = new Person();          // ✅ 클래스 접근 가능
        System.out.println(p.name);       // ✅ 변수 접근 가능
        p.introduce();                    // ✅ 메서드 호출 가능
    }
}
