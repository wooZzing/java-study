package chapter22.volatileExp;

class Worker extends Thread {
    private boolean running = true; // ✅ volatile 추가

    public void stopRunning() {
        running = false;
    }

    public void run() {
        while (running) {
            // 반복 작업
        }
        System.out.println("스레드 종료");
    }
}