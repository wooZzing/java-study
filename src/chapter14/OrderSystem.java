package chapter14;

public class OrderSystem {

    // 햄버거만 주문
    public void order(String burger) {
        System.out.println("주문: " + burger);
    }

    // 햄버거 + 사이드
    public void order(String burger, String side) {
        System.out.println("주문: " + burger + " | 사이드: " + side);
    }

    // 햄버거 + 사이드 + 음료
    public void order(String burger, String side, String drink) {
        System.out.println("주문: " + burger + " | 사이드: " + side + " | 음료: " + drink);
    }

    public static void main(String[] args) {
        OrderSystem os = new OrderSystem();

        os.order("치즈버거");
        os.order("치킨버거", "감자튀김");
        os.order("불고기버거", "치즈스틱", "콜라");
    }
}