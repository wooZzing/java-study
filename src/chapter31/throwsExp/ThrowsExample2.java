package chapter31.throwsExp;

import java.io.FileReader;
import java.io.IOException;

public class ThrowsExample2 {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("test.txt");
        System.out.println("파일 열기 성공!");
    }
}