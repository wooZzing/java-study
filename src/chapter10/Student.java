package chapter10;

public class Student {
    static int count = 0;   // 클래스 변수 (모든 객체가 공유)
    String name;       // 인스턴스 변수 (객체마다 다름)

    public Student(String name) {
        this.name = name;
        count++;
        System.out.println(name + " 학생이 등록되었습니다.");
    }

    public void introduce() {
        System.out.println("안녕하세요, 저는 " + name + "입니다.");
    }

    /* 클래스 변수 메서드 */
    public static void printStudentCount() {
        System.out.println("현재 등록된 학생 수: " + count + "명");
    }
}
