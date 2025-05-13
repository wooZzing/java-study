package chapter38;

class Box<T> {
    private T value;

    // 값을 저장하는 메서드
    public void set(T value) {
        this.value = value;
    }

    // 값을 꺼내는 메서드
    public T get() {
        return value;
    }
}