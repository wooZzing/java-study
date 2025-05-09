package chapter37;

public class TestMain {
    public static void main(String[] args) {
        MyClass obj1 = new MyClass(1, "우진");
        MyClass obj2 = new MyClass(1, "우진");
        MyClass obj3 = new MyClass(2, "현수");

        System.out.println("toString() 출력:");
        System.out.println(obj1);  // MyClass { id=1, name='우진' }

        System.out.println("\nequals() 비교:");
        System.out.println("obj1 == obj2: " + (obj1 == obj2));        // false (주소 비교)
        System.out.println("obj1.equals(obj2): " + obj1.equals(obj2)); // true (내용 비교)

        System.out.println("\nhashCode() 비교:");
        System.out.println("obj1.hashCode(): " + obj1.hashCode());
        System.out.println("obj2.hashCode(): " + obj2.hashCode());
        System.out.println("obj3.hashCode(): " + obj3.hashCode());
    }
}