package chapter37;

public class MyClass {
    private int id;
    private String name;

    public MyClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // toString() 오버라이딩 – 객체를 문자열로 표현
    @Override
    public String toString() {
        return "MyClass { id=" + id + ", name='" + name + "' }";
    }

    // equals() 오버라이딩 – 논리적 비교
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;                      // 주소가 같으면 true
        if (!(obj instanceof MyClass)) return false;       // 타입 다르면 false
        MyClass other = (MyClass) obj;
        return this.id == other.id && this.name.equals(other.name);
    }

    // hashCode() 오버라이딩 – equals와 같이 사용해야 함
    @Override
    public int hashCode() {
        return id * 31 + name.hashCode();
    }
}