package chapter32;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("사과");
        fruits.add("바나나");
        fruits.add("사과"); // 중복 허용

        System.out.println(fruits); // [사과, 바나나, 사과]

        System.out.println("첫 번째 과일: " + fruits.get(0)); // 사과
        System.out.println("총 과일 개수: " + fruits.size()); // 3

        System.out.println("========반복문 1========");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("========반복문 2========");

        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }
    }
}