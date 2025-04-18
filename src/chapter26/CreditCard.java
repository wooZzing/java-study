package chapter26;

class CreditCard implements Payment {
    public void pay(int amount) {
        System.out.println("신용카드로 " + amount + "원 결제");
    }
}