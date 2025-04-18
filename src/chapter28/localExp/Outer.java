package chapter28.localExp;

public class Outer {
    private String msg = "외부 메시지";

    public void display() {
        int number = 100;  // effectively final (값 변경 없음)

        class LocalInner {
            public void show() {
                // 외부 클래스 멤버 및 final 지역 변수 접근 가능
                System.out.println(msg);
                System.out.println("number = " + number);
            }
        }

        LocalInner inner = new LocalInner();
        inner.show();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.display();
    }
}