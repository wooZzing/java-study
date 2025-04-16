package chapter22.transientExp;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        User user = new User("ohwoojin", "1234");

        // 직렬화
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("user.ser"))) {
            out.writeObject(user);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 역직렬화
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("user.ser"))) {
            User restored = (User) in.readObject();
            System.out.println("복원된 객체: " + restored);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}