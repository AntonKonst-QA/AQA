package Homework.Work_4;

import java.util.Scanner;

public class BandC {

    // 1. Сумма чисел до первого отрицательного (использовать break)
    public static void sumOfNum() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.println("Введите число:");
            int num = sc.nextInt();
            if (num < 0) break;
            sum += num;
        }
        System.out.println("Сумма: " + sum);
    }

    // 2. Пропуск чисел, делящихся на 3 (использовать continue)
    public static void numberOmission() {
        for (int i =1 ; i <= 20; i++) {
            if (i % 3 == 0) continue;
            System.out.println(i);
        }
    }

    // 3. Вывод только положительных чисел (использовать continue)
    public static void outputOfPositiveNumber() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Введите число:");
            int num = sc.nextInt();
            if (num == 0) break;
            if (num < 0) continue;
            System.out.println("Положительное число: " + num);
        }

    }

    // 4. Ввод строк до команды "stop" (использовать break)
    public static void stringInput() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Введдите строку:");
            String s = sc.nextLine();
            if (s.equals("stop")) break;
            System.out.println("Вы ввели: " + s);
        } System.out.println("Программа завершена");


    }
}
