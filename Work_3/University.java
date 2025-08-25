package Homework.Work_3;

public class University {
    static String universityName = "Высший пилотаж";
    final int StudentID;
    String studentName;

    // Конструктор
    University(int someStudentID, String someStudentName) {
        this.StudentID = someStudentID;
        this.studentName = someStudentName;
    }

    // Статический метод
    static void changeUniversityName(String newName) {
        universityName = newName;
    }
    // Геттеры
    String getStudentName() {
        return studentName;
    }

    // Метод
    void printStudentInfo() {
        System.out.println("Имя: " + this.studentName + ", ID: " + this.StudentID + ", Университет: " + universityName);
    }
}
