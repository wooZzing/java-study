package chapter04;

public class Conditional07 {
    public static void main(String[] args) {
        int dayOfWeek = 4; // 요일을 나타내는 숫자 (1: 월요일, ..., 7: 일요일)
        String dayName = "";

        // 요일에 따른 이름 출력
        switch (dayOfWeek) {
            case 1:
                dayName = "월요일";
            case 2:
                dayName = "화요일";
            case 3:
                dayName = "수요일";
            case 4:
                dayName = "목요일"; // 이 case가 실행되지만, break문이 없으므로 계속 실행됩니다.
            case 5:
                dayName = "금요일";
            case 6:
                dayName = "토요일";
            case 7:
                dayName = "일요일";
            default:
                dayName = "잘못된 요일 번호";
        }

        System.out.println(dayName + " 입니다.");
    }
}
