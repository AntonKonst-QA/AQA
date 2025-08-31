package Homework.Work_4;

import java.util.Scanner;
import java.util.stream.StreamSupport;

public class Switch {
    // 1. Вывод дня недели по номеру
    public static void conclusionOfDay() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число дня недели:");
        int num = sc.nextInt();

        switch (num) {
            case 1 -> System.out.println("Понедельник");
            case 2 -> System.out.println("Вторник");
            case 3 -> System.out.println("Среда");
            case 4 -> System.out.println("Четверг");
            case 5 -> System.out.println("Пятница");
            case 6 -> System.out.println("Суббота");
            case 7 -> System.out.println("Воскресенье");
        }
    }

    // 2. Стоймость билета по дню недели
public static void ticketPrice() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число дня недели:");
        int num = sc.nextInt();

        switch (num) {
            case 1, 2, 3, 4, 5 -> System.out.println("Стоймость билета 300 рублей");
            case 6, 7 -> System.out.println("Стоймость билета 450 рублей");
        }
}

// 3. Перевод числовых оценко в буквенные (A-F)
public static void conversationNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите Ваш балл:");
        int num = sc.nextInt();

        switch (num/10) {
            case 9, 10 -> System.out.println("Ваша оценка - A");
            case 8 -> System.out.println("Ваша оценка - B");
            case 7 -> System.out.println("Ваша оценка - C");
            case 6 -> System.out.println("Ваша оценка - D");
            case 5, 4, 3, 2, 1, 0 -> System.out.println("Ваша оценка - F");
        }

        if (num >= 90 & num <= 100) {
            System.out.println("Ваша оценка - A");
        } else if (num >=80 & num <= 89) {
            System.out.println("Ваша оценка - B");
        } else if (num >= 70 & num <= 79) {
            System.out.println("Ваша оценка - C");
        } else if (num >= 60 & num <= 69) {
            System.out.println("Ваша оценка - D");
        } else {
            System.out.println("Ваша оценка - F");
        }
}

// 4. Обработка текстовых команд
public static void textCom() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите команду:");
        String text = sc.nextLine();

        switch (text) {
            case "start" -> System.out.println("Система запущена");
            case "stop" -> System.out.println("Система остановлена");
            case "restart" -> System.out.println("Система перезапущена");
            case "status" -> System.out.println("Проверка системы");
            default -> System.out.println("Неизвестная команда");
        }
}

// 5. Простой калькулятор с использованием switch
public static void calc() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число:");
        double num1 = sc.nextInt();
        System.out.println("Введите второе число:");
        double num2 = sc.nextInt();
        System.out.println("Введите операцию:");
        String op = sc.next();

        switch (op) {
            case "+" -> System.out.println("Результат: " + (num1 + num2));
            case "-" -> System.out.println("Результат: " + (num1 - num2));
            case "*" -> System.out.println("Результат: " + (num1 * num2));
            case "/" -> {
                if (num2 == 0) System.out.println("На ноль делить нельзя");
            else System.out.println("Результат: " + (num1 / num2));
            }
        }

}


}
