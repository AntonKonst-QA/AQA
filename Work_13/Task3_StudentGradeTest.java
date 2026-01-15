package Homework.Work_13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task3_StudentGradeTest {

    private final GradeService<Integer> service = new GradeService<>();

    @Test //Добавление оценки
    void shouldAddGrade() {
        service.addGrade(new Task3_StudentGrade<>("Anton", "Phiz", 5));

        assertEquals(1, service.size());
    }

    @Test //Негативная оценка
    void shouldThrowExceptionForNegativeGrade() {
        assertThrows(InvalidGradeException.class, () -> service.addGrade(new Task3_StudentGrade<>("Anton", "Phiz", -1)));
    }

    @Test
    void shouldCalculateAverageGrade() {
        service.addGrade(new Task3_StudentGrade<>("A", "Phiz", 4));
        service.addGrade(new Task3_StudentGrade<>("B", "Phiz", 6));
        service.addGrade(new Task3_StudentGrade<>("C", "Math", 5));


        double avg = service.averageBySubject("Phiz");

        assertEquals(5.0, avg);
    }
}
