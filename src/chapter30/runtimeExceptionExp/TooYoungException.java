package chapter30.runtimeExceptionExp;

// 나이 제한 예외 클래스
public class TooYoungException extends RuntimeException {
    public TooYoungException(String message) {
        super(message);  // 예외 메시지를 부모 클래스에 전달
    }
}