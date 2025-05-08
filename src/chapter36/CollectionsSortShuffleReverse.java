package chapter36;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSortShuffleReverse {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(3, 1, 4, 1, 5));

        Collections.sort(list);         // [1, 1, 3, 4, 5]
        System.out.println("정렬 후: " + list);

        Collections.reverse(list);      // [5, 4, 3, 1, 1]
        System.out.println("역순 정렬 후: " + list);

        Collections.shuffle(list);      // [무작위 순서]
        System.out.println("셔플 후: " + list);
    }
}