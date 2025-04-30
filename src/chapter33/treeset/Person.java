package chapter33.treeset;

class Person implements Comparable<Person> {
    String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.name); // 이름 기준으로 오름차순 정렬
    }
}