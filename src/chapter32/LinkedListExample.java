package chapter32;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();

        colors.add("빨강");
        colors.add("파랑");
        colors.addFirst("노랑");  // 맨 앞에 추가

        System.out.println(colors); // [노랑, 빨강, 파랑]

        colors.removeLast();        // 마지막 요소 제거
        System.out.println(colors); // [노랑, 빨강]

        System.out.println("========반복문========");

        for (String color : colors) {
            System.out.println(color);
        }

        System.out.println("첫 번째: " + colors.get(0));
        System.out.println("총 개수: " + colors.size());
    }
}