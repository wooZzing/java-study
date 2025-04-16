package chapter22.volatileExp;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Worker worker = new Worker();
        worker.start();

        Thread.sleep(1000);
        worker.stopRunning(); // 값을 false로 바꿈
    }
}