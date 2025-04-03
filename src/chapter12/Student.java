package chapter12;

public class Student {
    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    // 인스턴스 메서드
    public void introduce() {
        System.out.println("안녕하세요, 저는 " + name + "이고 점수는 " + score + "점입니다.");
    }

    public boolean isPassed() {
        return score >= 60;
    }
}