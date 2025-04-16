package chapter22.synchronizedExp;

class MyThread extends Thread {
    private SharedPrinter printer;
    private String message;

    public MyThread(SharedPrinter printer, String message) {
        this.printer = printer;
        this.message = message;
    }

    public void run() {
        printer.print(message);
    }
}