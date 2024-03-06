package chapter04;

public class Conditional04 {
    public static void main(String[] args) {
        int dayOfWeek = 4; // 요일을 나타내는 숫자 (1: 월요일, ..., 7: 일요일)

        // 요일에 따른 이름 출력
        switch (dayOfWeek) {
            case 1:
                System.out.println("월요일");
                break;
            case 2:
                System.out.println("화요일");
                break;
            case 3:
                System.out.println("수요일");
                break;
            case 4:
                System.out.println("목요일"); // 이 case가 실행됩니다.
                break;
            case 5:
                System.out.println("금요일");
                break;
            case 6:
                System.out.println("토요일");
                break;
            case 7:
                System.out.println("일요일");
                break;
            default:
                System.out.println("잘못된 요일 번호입니다.");
        }
    }
}
