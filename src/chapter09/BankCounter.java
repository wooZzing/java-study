package chapter09;

public class BankCounter {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        // 1000원 입금
        bankAccount.deposit(1000);

        // 300원 출금
        bankAccount.withdraw(300);

        // 계좌 잔액 조회
        System.out.println("계좌 잔액 : " + bankAccount.getAccount());

        //bankAccount.account = -99999;  // 에러! 잔액에 직접 접근 불가
    }
}
