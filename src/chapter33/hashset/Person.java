package chapter33.hashset;

class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    // 이름이 같으면 같은 사람으로 취급
    @Override
    public boolean equals(Object o) {
        if (o instanceof Person) {
            return this.name.equals(((Person) o).name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}