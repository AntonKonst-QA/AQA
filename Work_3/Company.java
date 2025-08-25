package Homework.Work_3;

public class Company {
    static String companyName = "Улица Сизам";
    final int employeeID;
    String employeeName;

    // Конструктор
    Company(int employeeID, String employeeName) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    // Статический метод
    static void printCompanyName() {
        System.out.println("Имя компании: " + companyName);
    }

    // Геттеры для employeeName
    String getEmployeeName() {
        return employeeName;
    }

    // Сеттеры для employeeName
    void setEmployeeName(String newEmployeeName) {
        this.employeeName = newEmployeeName;
    }
    void printEmployeeInfo() {
        System.out.println("Имя компании: " + companyName + " ID сотрудника: " + this.employeeID + " Имя сотрудника: " + this.employeeName);
    }
}
