package chapter28.staticExp;

public class Outer {
    private static String staticMsg = "정적 메시지입니다.";

    static class Inner {
        public void showMessage() {
            // 외부 클래스의 static 멤버 접근 가능
            System.out.println(staticMsg);
        }
    }

    public static void main(String[] args) {
        Outer.Inner inner = new Outer.Inner();  // 외부 클래스 인스턴스 없이 생성
        inner.showMessage();
    }
}