package Homework.Work_4;

import java.util.Scanner;

public class DoWhile {

    // 1. Запрос положительного числа
    public static void PositiveNum() {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("Введите число:");
            num = sc.nextInt();
        } while (num <= 0);
        System.out.println("Вы ввели: " + num);
    }

    // 2. Проверка пароля
    public static void checkPass() {
        Scanner sc = new Scanner(System.in);
        String correctPassword = "1234";
        String input;
        do {
            System.out.println("Введите пароль:");
            input = sc.nextLine();
        } while (!input.equals(correctPassword));
        System.out.println("Пароль верный");
    }

    // 3. Вывод чисел от 1 до 10 с использованием do-while
    public static void outputOfNum() {
        int i = 1;
        do {
            System.out.println(i + " ");
            i++;
        } while (i <= 10);
    }

    // 4. Завершение программы по команде "exit"
    public static void endOfCom() {
        Scanner sc = new Scanner(System.in);
        String com;

        do {
            System.out.println("Введите команду: ");
            com = sc.nextLine();
        } while (!com.equals("exit"));
        System.out.println("Программа завершена");
    }

    // 5. Подсчет количества цифр в числе
    public static void countingNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int n = sc.nextInt();
        int count = 0;

        do {
            n = n / 10;
            count ++;
        } while (n != 0);
        System.out.println("Количество цифр " + count);
    }
}
