package chapter33.hashset;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Spring");
        set.add("Java"); // 중복 ❌ 무시됨
        System.out.println(set);

        List<String> emails = List.of("a@test.com", "b@test.com", "a@test.com");

        Set<String> uniqueEmails = new HashSet<>(emails);
        System.out.println(uniqueEmails); // [a@test.com, b@test.com]

        Set<Person> set1 = new HashSet<>();
        set1.add(new Person("우진"));
        set1.add(new Person("우진")); // 중복! 안 들어감

        System.out.println(set1.size()); // 1
    }
}
