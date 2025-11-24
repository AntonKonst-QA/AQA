package Homework.Work_7.HashSet;

import java.util.HashSet;

public class Task4_CheckName {
    public static void main(String[] args) {
        HashSet<String> name = new HashSet<>();
        name.add("Валерий");
        name.add("Максим");
        name.add("Вероника");
        name.add("Светлана");

        String checkName = "Максим";

        if (name.contains (checkName)) {
            System.out.println("Имя: " + checkName);
        } else {
            System.out.println("Имени " + checkName + " нет в списке.");
        }
    }
}
