package chapter07;

public class ObjectOriented4 {
    static class TV {
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
            System.out.println("채널을 " + newChannel + "로 변경합니다.");
        }
    }

    public static void main(String[] args) {
        TV tv1 = new TV();      // TV객체 1 생성
        TV tv2 = new TV();      // TV객체 2 생성

        tv1.turnOnTV(); // TV1 켜기
        tv1.changeChannel(5); // TV1 채널 변경

        tv2.turnOnTV(); // TV2 켜기
        tv2.changeChannel(8); // TV2 채널 변경
    }
}