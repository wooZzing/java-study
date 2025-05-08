package chapter36;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsMaxFrequency {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 1, 4, 1));

        int max = Collections.max(list);
        int count = Collections.frequency(list, 1);

        System.out.println("최댓값: " + max);         // 4
        System.out.println("1의 등장 횟수: " + count); // 3
    }
}