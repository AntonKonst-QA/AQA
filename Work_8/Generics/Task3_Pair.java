package Homework.Work_8.Generics;

public class Task3_Pair <T,U> {
    private T first;
    private U second;

    public Task3_Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public U getSecond() {
        return second;
    }

    public void setSecond(U second) {
        this.second = second;
    }

    public static void main(String[] args) {
        Task3_Pair <String, Integer> person = new Task3_Pair<>("Антон", 18);
        System.out.println("Имя: " + person.getFirst() + ", возраст: " + person.getSecond());
        person.setFirst("Петя");
        person.setSecond(25);
        System.out.println("Имя: " + person.getFirst() + ", возраст: " + person.getSecond());
    }
}
