package Homework.Work_1;

public class MathOperations {
    public static void main (String[] args) {

        int add1 = add(3, 4);
        int sub1 = subtract(18, 8);
        int mult1 = multiply(4, 5);
        double div1 = divide(50, 4);
        // Задание 2
        int fM1 = findMax(1001, 998);
        // Задание 3
        int dif1 = difference(23, 56);
        // Задание 4
        int sA1 = squareArea(16);
        int sP1 = squarePerimeter(8);
        // Задание 5
        double cSTM1 = convertSecondsToMinutes(800);
        // Задание 6
        double aS1 = averageSpeed(300.12, 60.4);
        // Задание 7
        double fH1 = findHypotenuse(3, 4);
        // Задание 8
        double cC1 = circleCircumference(14);
        // Задание 9
        double cP1 = calculatePercentage(30, 900);
        // Задание 10
        double cTF1 = celsiusToFahrenheit(20);
        double fTC1 = fahrenheitToCelsius(320);


    System.out.println("Возвращаем сумму двух чисел " + add1);
    System.out.println("Возвращаем разницу " + sub1);
    System.out.println("Возвращаем произведение " + mult1);
    System.out.println("Возвращаем результат деления " + div1);
    // Задание 2
    System.out.println("Возвращаем большее из двух чисел " + fM1);
    // Задание 3
    System.out.println("Возвращаем модуль разности двух чисел " +dif1);
    // Задание 4
    System.out.println("Возвращаем площадь квадрата " + sA1);
    System.out.println("Возвращаем периметр " + sP1);
    // Задание 5
    System.out.println("Количество минут " + cSTM1);
    // Задание 6
    System.out.println("Возвращаем среднюю скорость " + aS1);
    // Задание 7
    System.out.println("Вычислили гипотенузу по теореме пифагора " + fH1);
    // Задание 8
    System.out.println("Возвращаем длину окружности " + cC1);
    // Задание 9
    System.out.println("Возвращаем процент от общего " + cP1);
    // Задание 10
    System.out.println("Перевод в Фаренгейты: " + cTF1);
    System.out.println("Перевод в Цельсий: " + fTC1);

    }
    // Задание 1
    public static int add(int x, int y) {
        return x + y;
    }
    public static int subtract(int x, int y) {
        return x - y;
    }
    public static int multiply(int x, int y) {
        return x * y;
    }
    public static double divide(int x, int y) {
        return (double) x / y;
    }
    // Задание 2
    public static int findMax(int a, int b) {
        return Math.max(a, b);
    }
    // Задание 3
    public static int difference(int x, int y) {
        int abs = Math.abs(x - y);
        return abs;
    }
    // Задание 4
    public static int squareArea (int side) {
        return side * side;
    }
    public static int squarePerimeter(int side) {
        return 4 * side;
    }
    // Задание 5
    public static double convertSecondsToMinutes(double seconds) {
        return seconds / 60.0;
    }
    // Задание 6
   public static double averageSpeed(double distance, double time) {
        return (distance / time);
   }
    // Задание 7
    public static double findHypotenuse(double a, double b) {
        return Math.sqrt(a*a + b*b);
    }
    // Задание 8
    public static double circleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }
    // Задание 9
    public static double calculatePercentage(double total, double part) {
        return (part / total) * 100;
    }
    // Задание 10
    public static double celsiusToFahrenheit(double c) {
        return c * 9 / 5 + 32;
    }
    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }
}
