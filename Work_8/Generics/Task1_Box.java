package Homework.Work_8.Generics;

public class Task1_Box <T> {
    private T item;
    public void set (T item) {
        this.item = item;
    }
    public T get() {
        return item;
    }

    public static void main(String[] args) {
    Task1_Box <String> StringBox = new Task1_Box<>();
    StringBox.set("Привет!");
    System.out.println(StringBox.get());
    Task1_Box <Integer> intBox = new Task1_Box<>();
    intBox.set(1234567890);
    System.out.println(intBox.get());
    }
}

