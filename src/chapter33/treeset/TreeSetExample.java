package chapter33.treeset;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(30);
        set.add(10);
        set.add(20);
        set.add(10); // 중복 ❌ 무시됨

        System.out.println(set); // [10, 20, 30] ← 자동 오름차순 정렬됨!

        Set<String> names = new TreeSet<>();
        names.add("민수");
        names.add("지민");
        names.add("우진");

        System.out.println(names); // [민수, 우진, 지민] → 가나다순 정렬

        Set<String> set1 = new TreeSet<>(Comparator.reverseOrder());
        set1.add("banana");
        set1.add("apple");
        set1.add("cherry");

        System.out.println(set1); // [cherry, banana, apple] ← 내림차순 정렬!

        Set<Person> set2 = new TreeSet<>();
        set2.add(new Person("우진"));
        set2.add(new Person("우진")); // compareTo() 결과가 0 → 중복으로 판단됨

        System.out.println(set2.size()); // 1
    }
}
