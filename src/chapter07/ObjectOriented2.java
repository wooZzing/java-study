package chapter07;

public class ObjectOriented2 {
    static boolean[] powerOn = {false, false};
    static int[] channel = {1, 1};

    public static void turnOnTV(int tvNumber) {
        powerOn[tvNumber] = true;
        System.out.println("TV" + (tvNumber + 1) + "를 켭니다.");
    }

    public static void changeChannel(int tvNumber, int newChannel) {
        if (!powerOn[tvNumber]) {
            System.out.println("TV" + (tvNumber + 1) + "가 꺼져 있습니다. 먼저 TV를 켜세요.");
            return;
        }
        channel[tvNumber] = newChannel;
        System.out.println("TV" + (tvNumber + 1) + "의 채널을 " + newChannel + "로 변경합니다.");
    }

    public static void main(String[] args) {
        turnOnTV(0); // TV1 켜기
        changeChannel(0, 5); // TV1 채널 변경

        turnOnTV(1); // TV2 켜기
        changeChannel(1, 8); // TV2 채널 변경
    }
}
