package chapter36;

import java.util.Arrays;

public class ArraysCopyExample {
    public static void main(String[] args) {
        int[] original = {1, 2, 3};
        int[] copy = Arrays.copyOf(original, 5); // 길이 5로 복사
        System.out.println(Arrays.toString(copy)); // [1, 2, 3, 0, 0]
    }
}