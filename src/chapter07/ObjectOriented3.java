package chapter07;

public class ObjectOriented3 {
    boolean powerOn = false;
    int channel = 1;

    public void turnOnTV() {
        powerOn = true;
        System.out.println("TV를 켭니다.");
    }

    public void changeChannel(int newChannel) {
        if (!powerOn) {
            System.out.println("TV가 꺼져 있습니다. 먼저 TV를 켜세요.");
            return;
        }
        channel = newChannel;
        System.out.println("채널을 " + channel + "로 변경합니다.");
    }

    public static void main(String[] args) {
        ObjectOriented3 myTV = new ObjectOriented3();	// TV객체 생성
        myTV.turnOnTV();
        myTV.changeChannel(5);
    }
}