package chapter36;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraysVsCollectionsExample {
    public static void main(String[] args) {
        // 배열 정렬
        int[] arr = {3, 1, 4};
        Arrays.sort(arr);
        System.out.println("배열 정렬: " + Arrays.toString(arr)); // [1, 3, 4]

        // 리스트 정렬
        List<Integer> list = new ArrayList<>(List.of(3, 1, 4));
        Collections.sort(list);
        System.out.println("리스트 정렬: " + list); // [1, 3, 4]
    }
}