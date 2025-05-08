package chapter36;

import java.util.Arrays;

public class ArraysSortExample {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 1};
        Arrays.sort(numbers);  // 오름차순 정렬
        System.out.println(Arrays.toString(numbers)); // [1, 3, 5, 8]
    }
}