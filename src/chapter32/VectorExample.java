package chapter32;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();

        vector.add("A");
        vector.add("B");
        vector.add("C");

        System.out.println(vector); // [A, B, C]

        vector.remove(1); // B 제거
        System.out.println("B 제거 후: " + vector); // [A, C]

        System.out.println("0번 인덱스: " + vector.get(0)); // A
    }
}