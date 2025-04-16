package chapter22.synchronizedExp;

public class Main {
    public static void main(String[] args) {
        SharedPrinter printer = new SharedPrinter();

        Thread t1 = new MyThread(printer, "A");
        Thread t2 = new MyThread(printer, "B");

        t1.start();
        t2.start();
    }
}