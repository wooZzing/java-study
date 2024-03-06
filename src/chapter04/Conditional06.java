package chapter04;

public class Conditional06 {
    public static void main(String[] args) {
        int dayOfWeek = 1; // 요일을 나타내는 숫자 (1: 월요일, ..., 7: 일요일)

        String message = "오늘의 준비물 : ";

        // 요일에 따라 준비물을 누적시키는 switch 문
        switch (dayOfWeek) {
            case 1: // 월요일
                message += "펜 ";
                // break가 없으므로 다음 case로 이어집니다.
            case 2: // 화요일
                message += "책 ";
                // break가 없으므로 다음 case로 이어집니다.
            case 3: // 수요일
                message += "안경 ";
                // break가 없으므로 다음 case로 이어집니다.
            case 4: // 목요일
                message += "수첩 ";
                // break가 없으므로 다음 case로 이어집니다.
            case 5: // 금요일
                message += "노트북 ";
                break; // 여기서 switch 문 종료
            case 6: // 토요일
            case 7: // 일요일
                message += "휴일 ";
                break;
            default:
                message = "잘못된 요일입니다.";
                break;
        }

        System.out.println(message);
    }
}
