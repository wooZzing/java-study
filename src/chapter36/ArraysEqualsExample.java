package chapter36;

import java.util.Arrays;

public class ArraysEqualsExample {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};

        System.out.println(Arrays.equals(a, b)); // true
        System.out.println(a == b);              // false (주소 비교)
    }
}