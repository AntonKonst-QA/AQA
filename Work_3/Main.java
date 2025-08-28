package Homework.Work_3;

public class Main {
    public static void main(String[] args) {

        // Класс Company
        Company eN1 = new Company(1, "Лабуба");
        Company eN2 = new Company(2, "Буба");

        eN1.printEmployeeInfo();
        eN2.printEmployeeInfo();

        Company.companyName = "Монстры";
        Company.printCompanyName();

        eN1.printEmployeeInfo();
        eN2.printEmployeeInfo();

       // eN1.employeeID = 3;

        // Класс MathConstants
        System.out.println("Площадь круга: " + MathConstants.calculateCircleArea(2));
        System.out.println("Длина окружности: " + MathConstants.calculateCircumference(6));

        System.out.println("Площадь круга: " + MathConstants.calculateCircleArea(3));
        System.out.println("Длина окружности: " + MathConstants.calculateCircumference(10));

        // Класс University
        University sN1 = new University(1,"Выся");
        University sN2 = new University(2, "Петя");
        University sN3 = new University(3, "Илья");

        sN1.printStudentInfo();
        sN2.printStudentInfo();
        sN3.printStudentInfo();

        University.changeUniversityName("Великий");

        sN1.printStudentInfo();
        sN2.printStudentInfo();
        sN3.printStudentInfo();


        //Класс GameSettings
        GameSettings gN1 = new GameSettings("Pirate");
        GameSettings gN2 = new GameSettings("Zombie");

        gN1.printGameStatus();
        gN2.printGameStatus();

        GameSettings.setMaxPlayers(4);

        gN1.addPlayer();
        gN2.addPlayer();
        gN2.addPlayer();
        gN2.addPlayer();
        gN2.addPlayer();
        gN2.addPlayer();

        gN1.printGameStatus();
        gN2.printGameStatus();



        //Класс Person
        Person fN1 = new Person("Иван", "Иванов", "123-45-6789");
        Person fN2 = new Person("Петр", "Петров", "987-65-4321");

        fN1.printPersonInfo();
        fN2.printPersonInfo();

        fN1.setFirstName("Яков");

        fN1.printPersonInfo();
        fN2.printPersonInfo();
    }

}
