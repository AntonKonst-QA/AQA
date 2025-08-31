package Homework.Work_4;

import java.util.Scanner;

public class While {
    // 1. Вычисление факториала с помощью while
    public static void factorialCalculate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int n = sc.nextInt();
        int result = 1;
        int i = 1;

        while (i <= n) {
            result *= i;
            i++;
        }
        System.out.println("Факториал n: " + result);
    }

    // 2. Вывод всех чётных чисел до заданного
    public static void outOfNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int num = sc.nextInt();
        int i = 1;

        while (i <= num) {
            if (i % 2 == 0) System.out.println(i + " ");
            i++;
        }
    }

    // 3. Обратный отсчёт от введённого числа до 1
    public static void countdownFromNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите положительное число:");
        int num = sc.nextInt();

        while (num >= 1) {
            System.out.println(num + " ");
            num--;
        }
    }
}
