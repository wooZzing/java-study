package Chapter03;

public class Operater05 {
    public static void main(String[] args) {
        // 삼항 연산자를 사용하여 성인, 미성년자를 판별합니다.
        int age = 17;
        String verifyage = age >= 19 ? "성인" : "미성년자";
        System.out.println("귀하의 나이는 " + age + "살이므로, " + verifyage + "입니다.");

        // 삼항 연산자를 사용하여 양수, 음수, 0을 판별합니다.
        int number = -7;
        String sign = number > 0 ? "양수" :
                      number < 0 ? "음수" : "0";

        System.out.println(number + " 은(는) " + sign + " 입니다.");

        int score = 75;
        String grade;

        // 삼항 연산자를 사용하여 점수에 따라 등급을 결정합니다.
        grade = score >= 90 ? "A" :
                score >= 80 ? "B" :
                score >= 70 ? "C" :
                score >= 60 ? "D" : "F";

        System.out.println("점수는 " + score + "점이고, 등급은 " + grade + " 입니다.");
    }
}
