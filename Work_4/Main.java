package Homework.Work_4;

public class Main {
    public static void main(String[] args) {
        // Определние знака числа
        IfElse.signOfNumber();

        // Поиск наибольшего из двух чисел
        IfElse.greaterOfTwo();

        // Вывод оценки по шкале 1-5
        IfElse.assessmentConclusion();

        // Проверка на чётность
        IfElse.evenCheck();

        // Определение размера скидки по возрасту
        IfElse.discountAmount();

        // Оценка результата теста по баллам
        IfElse.testResult();

        // Задачи на switch
        // Вывод дня недели по номеру
        Switch.conclusionOfDay();

        // Стоймость билета по дню недели
        Switch.ticketPrice();

        // Перевод числовых оценко в буквенные (A-F)
        Switch.conversationNum();

        // Обработка текстовых команд
        Switch.textCom();

        // Простой калькулятор с использованием switch
        Switch.calc();

        // For
        // Вывод чтсел от 1 до 100, делящихся на 3
        For.outputOfNumberUpToOneHundred();

        // 2. Сумма чисел от 1 до n
        For.sumOfNumbers();

        // 3.  Таблица умножения для числа
        For.multiplicationTable();

        // 4. Проверка на простое число
        For.simpleNumber();

        // 5. Вывод чисел от 1 до 10
        For.outputOfNumberUpToTen();

        // Класс While
        // 1. Вычисление факториала с помощью while
        While.factorialCalculate();

        // 2. Вывод всех чётных чисел до заданного
        While.outOfNum();


        // 3. Обратный отсчёт от введённого числа до 1
        While.countdownFromNum();

        //Задачи на do-while
        // 1. Запрос положительного числа
        DoWhile.PositiveNum();

        // 2. Проверка пароля
        DoWhile.checkPass();

        // 3. Вывод чисел от 1 до 10 с использованием do-while
        DoWhile.outputOfNum();

        // 4. Завершение программы по команде "exit"
        DoWhile.endOfCom();

        // 5. Подсчет количества цифр в числе
        DoWhile.countingNum();

        // Задачи на break и continue
        // 1. Сумма чисел до первого отрицательного (использовать break)
        BandC.sumOfNum();

        // 2. Пропуск чисел, делящихся на 3 (использовать continue)
        BandC.numberOmission();

        // 3. Вывод только положительных чисел (использовать continue)
        BandC.outputOfPositiveNumber();

        // 4. Ввод строк до команды "stop" (использовать break)
        BandC.stringInput();
    }
}
