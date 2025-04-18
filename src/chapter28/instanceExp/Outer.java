package chapter28.instanceExp;

public class Outer {
    private String name = "Outer";
    private int number = 42;

    class Inner {
        public void showName() {
            System.out.println("외부 클래스 이름: " + name);
        }

        // 명시적 참조
        public void print() {
            System.out.println("Outer.this.number = " + Outer.this.number);
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();               // 외부 클래스 인스턴스 생성
        Outer.Inner inner = outer.new Inner();   // 내부 클래스 인스턴스 생성
        inner.showName();                        // 메서드 호출
        inner.print();                           // 명시적 참조 호출
    }
}