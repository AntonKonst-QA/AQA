package Work3_YAGNI.After;

public class User {
    private String name;
    private String email;
    private String phoneNumber;

    public User(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String toString() {
        return "Имя: " + name + ", Email: " + email + ", Тел: " + phoneNumber;
    }
}
