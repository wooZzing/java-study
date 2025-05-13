package chapter38;

public class Main {
    public static void main(String[] args) {
        // 문자열 박스
        Box<String> stringBox = new Box<>();
        stringBox.set("Hello Generics!");
        String str = stringBox.get();
        System.out.println("stringBox: " + str);

        // 정수 박스
        Box<Integer> intBox = new Box<>();
        intBox.set(42);
        Integer num = intBox.get();
        System.out.println("intBox: " + num);

        // 제네릭 배열 출력 메서드 호출
        String[] fruits = {"apple", "banana", "cherry"};
        Integer[] numbers = {1, 2, 3, 4, 5};

        printArray(fruits);
        printArray(numbers);

        // 제네릭 두 값을 바꾸는 메서드 호출
        String a = "hello";
        String b = "world";

        // swap 후 결과는 메서드 안에서만 바뀜 (참조형 아닌 경우)
        swap(a, b); // 값은 실제로 바뀌지 않음 (참조 아님)

        System.out.println("a: " + a);
        System.out.println("b: " + b);

        // 참고: 참조형 객체의 경우 내부 상태는 바뀔 수 있음
    }

    // 제네릭 메서드 정의
    public static <T> void printArray(T[] array) {
        for (T item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    // 제네릭 메서드 – 두 값을 단순 출력만 함
    public static <T> void swap(T x, T y) {
        System.out.println("Before swap: x=" + x + ", y=" + y);
        T temp = x;
        x = y;
        y = temp;
        System.out.println("After swap: x=" + x + ", y=" + y);
    }
}