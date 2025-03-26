package chapter07;

public class ObjectOriented1 {
    static boolean powerOn = false;
    static int channel = 1;

    public static void turnOnTV() {
        powerOn = true;
        System.out.println("TV를 켭니다.");
    }

    public static void changeChannel(int newChannel) {
        if (!powerOn) {
            System.out.println("TV가 꺼져 있습니다. 먼저 TV를 켜세요.");
            return;
        }
        channel = newChannel;
        System.out.println("채널을 " + channel + "로 변경합니다.");
    }

    public static void getChannel() {
        System.out.println("현재 채널은 " + channel + " 입니다.");
    }

    public static void main(String[] args) {
        turnOnTV();
        changeChannel(5);
        getChannel();
    }
}
