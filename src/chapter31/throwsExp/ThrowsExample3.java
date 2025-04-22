package chapter31.throwsExp;

import java.io.FileReader;
import java.io.IOException;

public class ThrowsExample3 {
    public static void main(String[] args) {
        try {
            read();
        } catch (IOException e) {
            System.out.println("예외 발생: " + e.getMessage());
        }
        System.out.println("프로그램 계속 실행됩니다.");
    }

    public static void read() throws IOException {
        FileReader reader = new FileReader("test.txt");
    }
}