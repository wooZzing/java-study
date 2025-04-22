package chapter30.runtimeExceptionExp;

public class MembershipService {
    public void registerMember(int age) {
        if (age < 18) {
            throw new TooYoungException("18세 미만은 가입할 수 없습니다.");
        }

        System.out.println("회원가입이 완료되었습니다.");
    }
}