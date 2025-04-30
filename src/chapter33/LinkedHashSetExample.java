package chapter33;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("Java");
        set.add("Spring");
        set.add("Python");
        set.add("Java"); // 중복 ❌ 무시됨

        System.out.println(set);
        // [Java, Spring, Python] ← 입력한 순서 그대로 출력됨!

        List<String> input = List.of("B", "A", "C", "A", "B");

        Set<String> ordered = new LinkedHashSet<>(input);

        System.out.println(ordered); // [B, A, C] ← 입력 순서 + 중복 제거!
    }
}
