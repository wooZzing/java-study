package chapter10;

public class School {
    public static void main(String[] args) {
        Student s1 = new Student("지민");
        Student s2 = new Student("영수");
        Student s3 = new Student("하늘");

        s1.introduce();
        s2.introduce();
        s3.introduce();

        // 클래스 변수는 클래스명으로 접근 가능
        Student.printStudentCount();
    }
}
