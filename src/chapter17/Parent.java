package chapter17;

// 부모 클래스
class Parent {
    private int secret = 123;

    public Parent(String msg) {
        System.out.println("Parent 생성자: " + msg);
    }

    // private 멤버 간접 접근 메서드
    protected int getSecret() {
        return secret;
    }
}