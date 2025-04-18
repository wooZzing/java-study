package chapter26;

class KakaoPay implements Payment {
    public void pay(int amount) {
        System.out.println("카카오페이로 " + amount + "원 결제");
    }
}