package chapter35;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorRemoveError {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Alice", "Bob"));

        Iterator<String> it = names.iterator();
        // 다음 줄에서 예외 발생: IllegalStateException
        it.remove(); // ❌ next() 호출 없이 remove() 불가
    }
}