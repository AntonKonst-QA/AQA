package Homework.Work_8.Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Task1_FileNotFound {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("data.txt");
            System.out.println("Файл успешно открыт");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
