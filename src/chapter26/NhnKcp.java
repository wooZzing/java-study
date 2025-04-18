package chapter26;

class NhnKcp implements Payment, PointUsable {
    @Override
    public void pay(int amount) {
        System.out.println("NHN KCP로 " + amount + "원 결제");
    }

    @Override
    public void usePoint(int point) {
        System.out.println(point + " 포인트를 사용했습니다.");
    }
}