package chapter26;

public class Main2 {
    public static void main(String[] args) {
        makeSound(new Dog());   // 멍멍
        makeSound(new Cat());   // 야옹
        //makeSound(new Tiger()); // 필요에 따라 추가해도 코드 수정 없음
    }

    public static void makeSound(Animal animal) {
        animal.sound();  // 어떤 동물이든 sound()는 존재하니까 호출 가능!
    }
}