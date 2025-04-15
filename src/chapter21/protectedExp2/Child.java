package chapter21.protectedExp2;

import chapter21.protectedExp1.Parent;

public class Child extends Parent {
    public void introduce() {
        System.out.println("내 부모는: " + name);  // ⭕ protected 접근 가능
        hello();  // ⭕ 메서드도 호출 가능
    }
}