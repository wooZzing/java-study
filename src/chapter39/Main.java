package chapter39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob");
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        List<Double> scores = Arrays.asList(98.5, 88.2);

        printList(names);
        printList(numbers);
        printList(scores);

        // 숫자 리스트 합계
        List<Integer> intList = Arrays.asList(10, 20, 30);
        List<Double> doubleList = Arrays.asList(1.5, 2.5, 3.5);

        printSum(intList);
        printSum(doubleList);

        // 리스트에 값을 추가하기
        List<? super Integer> list = new ArrayList<Number>();

        list.add(10);    // ✅ Integer 추가 가능
        list.add(100);   // ✅ OK

        // list.add(3.14); // ❌ Double은 안 됨!

        for (Object item : list) {
            System.out.println(item);
        }

        //Integer value = list.get(0); // ❌ 컴파일 오류
        Object value = list.get(0);  // ✅ OK
    }

    // 어떤 타입의 리스트든 출력 가능!
    public static void printList(List<?> list) {
        for (Object item : list) {
            System.out.println(item);
        }
    }

    // Number 또는 그 자식 타입만 받을 수 있음
    public static void printSum(List<? extends Number> list) {
        double sum = 0;
        for (Number num : list) {
            sum += num.doubleValue();
        }
        System.out.println("합계: " + sum);
    }
}