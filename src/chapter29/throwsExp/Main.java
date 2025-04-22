package chapter29.throwsExp;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            readFile();  // 예외 발생 가능
        } catch (IOException e) {
            System.out.println("파일을 읽는 데 문제가 발생했습니다.");
        }
    }

    public static void readFile() throws IOException {
        FileReader reader = new FileReader("없는파일.txt");
        reader.read();
    }
}