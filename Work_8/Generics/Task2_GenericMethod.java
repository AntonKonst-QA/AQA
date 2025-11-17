package Homework.Work_8.Generics;

public class Task2_GenericMethod {
    public static <T> void printArray (T[] array) {
        for (T element: array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Integer [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        String [] words = {"пончик", "атмосфера", "корабль"};
        System.out.println("Массив чисел: ");
        printArray(numbers);
        System.out.println("Массив слов: ");
        printArray(words);
    }

}
