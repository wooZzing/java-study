package chapter35;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>(List.of("A", "B", "C"));
        ListIterator<String> it = items.listIterator();

        System.out.println("순방향 탐색:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("역방향 탐색:");
        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }
    }
}