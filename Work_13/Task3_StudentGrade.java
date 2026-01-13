package Homework.Work_13;

import java.util.ArrayList;
import java.util.List;

class InvalidGradeException extends RuntimeException {
    public InvalidGradeException(String message) {
        super(message);
    }
}
public class Task3_StudentGrade<T extends Number> {
    private String studentName;
    private String subject;
    private T grade;

    public void StudentGrade(String studentName, String subject, T grade) {
        this.studentName = studentName;
        this.subject = subject;
        this.grade = grade;
    }

    public String getSubject() {
        return subject;
    }

    public T getGrade() {
        return grade;
    }
class GradeService<T extends Number> {
        private final List<Task3_StudentGrade<T>> grades = new ArrayList<>();

        public synchronized void addGrade(Task3_StudentGrade<T> grade) {
            if (grade.getGrade().doubleValue() < 0) {
                throw new InvalidGradeException("Grade cannot be negative");
            }
            grades.add(grade);
        }

        public double averageBySubject(String subject) {
            return grades.stream()
                    .filter(g -> g.getSubject().equalsIgnoreCase(subject))
                    .mapToDouble(g -> g.getGrade().doubleValue())
                    .average()
                    .orElse(0.0);
        }
}
}

