package chapter12;

public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student("지민", 85);
        Student s2 = new Student("영수", 55);

        s1.introduce();  // "안녕하세요, 저는 지민이고 점수는 85점입니다."
        s2.introduce();  // "안녕하세요, 저는 영수이고 점수는 55점입니다."

        System.out.println(s1.isPassed());
        System.out.println(s2.isPassed());
    }
}