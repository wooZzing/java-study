package chapter04;

public class Conditional05 {
    public static void main(String[] args) {
        int dayOfWeek = 3; // 요일을 나타내는 숫자 (1: 월요일, ..., 7: 일요일)

        // 요일에 따라 메시지 출력 (break 문 생략)
        switch (dayOfWeek) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("주중입니다."); // 1 ~ 5일 경우, 이 메시지 출력
                break; // 여기서 switch 문을 종료
            case 6:
            case 7:
                System.out.println("주말입니다."); // 6, 7일 경우, 이 메시지 출력
                break;  // 여기서 switch 문을 종료
            default:
                System.out.println("잘못된 요일 번호입니다.");
        }
    }
}
