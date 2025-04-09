package chapter17;

// 자식 클래스
class Child extends Parent {
    // Child 클래스 생성자
    public Child() {
        super("Hello"); // Parent 클래스(부모 클래스) 생성자 호출
        System.out.println("Child 생성자");
    }

    public void printSecret() {
        // System.out.println(secret); ❌ 직접 접근 불가
        System.out.println(getSecret());  // ✅ 간접 접근
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.printSecret();
    }
}