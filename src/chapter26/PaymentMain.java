package chapter26;

public class PaymentMain {
    public static void main(String[] args) {
        processPayment(new NhnKcp(), 10000);
        processPayment(new KakaoPay(), 15000);
        processPayment(new CreditCard(), 20000);
    }

    public static void processPayment(Payment payment, int amount) {
        payment.pay(amount);

        // 만약 포인트도 사용할 수 있는 결제 수단이라면
        if (payment instanceof PointUsable) {
            ((PointUsable) payment).usePoint(1000);  // 다운캐스팅
        }

        System.out.println("-----");
    }
}