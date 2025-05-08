package chapter36;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsUnmodifiableExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("A", "B"));
        List<String> readOnly = Collections.unmodifiableList(names);

        System.out.println("읽기 전용 리스트: " + readOnly);

        // 아래 코드를 실행하면 예외 발생! (UnsupportedOperationException)
        // readOnly.add("C");
    }
}