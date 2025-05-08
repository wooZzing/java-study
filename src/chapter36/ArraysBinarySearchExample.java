package chapter36;

import java.util.Arrays;

public class ArraysBinarySearchExample {
    public static void main(String[] args) {
        int[] sorted = {10, 20, 30, 40};
        int index = Arrays.binarySearch(sorted, 30);
        System.out.println("30의 위치: " + index); // 2
    }
}