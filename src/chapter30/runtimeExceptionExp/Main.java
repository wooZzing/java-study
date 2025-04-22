package chapter30.runtimeExceptionExp;

public class Main {
    public static void main(String[] args) {
        MembershipService service = new MembershipService();

        try {
            service.registerMember(15);  // 예외 발생
        } catch (TooYoungException e) {
            System.out.println("예외 발생: " + e.getMessage());
        }
    }
}