package chapter22.transientExp;

import java.io.Serializable;

public class User implements Serializable {
    private String username;
    private transient String password; // 직렬화 제외

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String toString() {
        return "username: " + username + ", password: " + password;
    }
}