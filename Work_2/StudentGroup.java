package Homework.Work_2;

public class StudentGroup {
    String groupName;
    int studentCount;

    //Конструктор
    StudentGroup (String someGroupName, int someStudentCount) {
        this.groupName = someGroupName;
        this.studentCount = someStudentCount;
    }
    //Геттеры
    String getGroupName() {
        return this.groupName;
    }
    int getStudentCount() {
        return this.studentCount;
    }
    //Сеттеры
    void setGroupName(String newGroupName) {
        this.groupName = newGroupName;
    }
    void setStudentCount(int newStudentCount) {
        this.studentCount = newStudentCount;
    }
    //Метод
    void printInfo() {
        System.out.println("Группа: " + this.groupName + " Количетсов студентов: " + this.studentCount);
    }
}
