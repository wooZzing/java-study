package chapter21.protectedExp2;

import chapter21.protectedExp1.Parent;

public class Stranger {
    public void show() {
        Parent p = new Parent();
        // System.out.println(p.name);  // ❌ 에러 발생
        // p.hello();                   // ❌ 에러 발생
    }
}