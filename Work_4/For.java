package Homework.Work_4;

import java.util.Scanner;

public class For {
    // 1. Вывод чисел от 1 до 100, делящихся на 3
    public static void outputOfNumberUpToOneHundred() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) System.out.println(i);
        }
        System.out.println();
    }

    // 2. Сумма чисел от 1 до n
    public static void sumOfNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число больше 1");
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) sum += i;
        System.out.println("Сумма = " + sum);
    }

    // 3.  Таблица умножения для числа
    public static void multiplicationTable() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }

    // 4. Проверка на простое число
    public static void simpleNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int num = sc.nextInt();
        boolean isPrime = true;

        if (num <= 1) isPrime = false;
        else {
            for (int i = 2; i <= num; i++) {
                if (num % i == 0) System.out.println(i);
            }
            System.out.println();
        }
    }

    // 5. Вывод чисел от 1 до 10
    public static void outputOfNumberUpToTen() {
      for (int i=1; i <= 10; i++)
          System.out.println(i);
    }
}

