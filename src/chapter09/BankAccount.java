package chapter09;

public class BankAccount {
    private int account; // 외부에서 직접 접근 불가

    /* 입금 */
    public void deposit(int amount) {
        if (amount > 0) account += amount;
    }

    /* 출금 */
    public void withdraw(int amount) {
        if (amount > 0 && account >= amount) account -= amount;
    }

    /* 잔액 조회 */
    public int getAccount() {
        return account;
    }
}
