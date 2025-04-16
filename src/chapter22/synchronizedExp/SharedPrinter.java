package chapter22.synchronizedExp;

class SharedPrinter {
    public synchronized void print(String msg) {
        for (int i = 1; i <= 3; i++) {
            System.out.println(msg + " 출력 중... " + i);
            try { Thread.sleep(100); } catch (InterruptedException e) { }
        }
    }

    public void print2(String msg) {
        synchronized (this) {
            System.out.println("[" + msg + "] 시작");
            // ... 동기화된 코드 ...
        }
    }
}