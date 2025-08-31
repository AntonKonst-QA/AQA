package Homework.Work_4;

import java.util.Scanner;

public class IfElse {
    // 1. Определние знака числа
    public static void signOfNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("Число положительное");
        } else if (num < 0) {
            System.out.println("Число отричательное");
        } else {
            System.out.println("Число равно нулю");
        }
    }

    // 2. Поиск наибольшего из двух чисел
    public static void greaterOfTwo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int num1 = sc.nextInt();
        System.out.println("Введите второе число:");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("Первое число больше");
        } else {
            System.out.println("Второе число больше");
        }
    }

    // 3. Вывод оценки по шкале 1-5
    public static void assessmentConclusion() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите оценку от 1 до 5:");
        int num = sc.nextInt();

        switch (num) {
            case 5 -> System.out.println("Отлично");
            case 4 -> System.out.println("Хорошо");
            case 3 -> System.out.println("Удовлетворительно");
            case 2, 1 -> System.out.println("Неудовлетворительно");
        }

        if (num == 5) {
            System.out.println("Отлично");
        } else if (num == 4) {
            System.out.println("Хорошо");
        } else if (num == 3) {
            System.out.println("Удовлетворительно");
        } else {
            System.out.println("Неудовлетворительно");
        }
    }

    // 4. Проверка на чётность
    public static void evenCheck() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("Чётное число");
        } else {
            System.out.println("Нечётное число");
        }

    }

    // 5. Определение размера скидки по возрасту
    public static void discountAmount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ваш возраст:");
        int num = sc.nextInt();

        if (num < 18 & num > 0) {
            System.out.println("Ваша скидка 25%");
        } else if (num >= 65) {
            System.out.println("Ваша скидка 30%");
        } else {
            System.out.println("Вам скидка не предоставляется");
        }
    }

    // 6. Оценка результата теста по баллам
    public static void testResult() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ваш балл:");
        int num = sc.nextInt();

        if (num >= 90 & num <= 100) {
            System.out.println("Отлично");
        } else if (num >=75 & num <=89) {
            System.out.println("Хорошо");
        } else if (num >=60 & num <=74) {
            System.out.println("Удовлетворительно");
        } else {
            System.out.println("Неудовлетворительно");
        }
    }
}
