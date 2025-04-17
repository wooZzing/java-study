package chapter23;

public class Main2 {
    public static void main(String[] args) {
        Animal a = new Dog();  // 업캐스팅 (부모 타입으로 자식 객체 참조)

        a.sound(); // 멍멍 (다형성에 의해 실제 Dog의 sound() 호출)

        // 자식 클래스에만 있는 메서드는 사용 불가
        // a.sniff(); ❌ 컴파일 에러 발생 (Animal에는 sniff()가 없음)

        // instanceof로 실제 타입 확인 후 다운캐스팅
        if (a instanceof Dog) {
            Dog dog = (Dog) a;  // 다운캐스팅
            dog.sniff();        // "개가 냄새를 맡습니다" 출력
        }
    }
}
