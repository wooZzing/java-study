package chapter21.defaultExp2;

import chapter21.defaultExp1.Tiger;

public class Zoo {
    public static void main(String[] args) {
        Tiger t = new Tiger();           // ⭕ Tiger 클래스는 public이므로 생성 가능
        // System.out.println(t.name);   // ❌ default 변수는 접근 불가
        // t.roar();                     // ❌ default 메서드도 접근 불가
    }
}
