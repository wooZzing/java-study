package chapter35;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorModifyExample {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>(List.of("A", "B", "C"));
        ListIterator<String> it = items.listIterator();

        while (it.hasNext()) {
            String val = it.next();
            if (val.equals("B")) {
                it.set("BB");       // 요소 수정
                it.add("Between");  // B 다음에 추가됨
            }
        }

        System.out.println(items); // [A, BB, Between, C]
    }
}