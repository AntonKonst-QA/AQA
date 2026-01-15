package Homework.Work_13;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task6_TaskServiceTest {
    @Test //Добавление задачи
    void shouldAddTask() {
        Task6_TaskService<Integer> service = new Task6_TaskService<>();

        service.addTask(new Task<>(1, Status.OPEN, Priority.LOW, LocalDate.now()));

        assertEquals(1, service.getAll().size());
    }

    @Test // Удаление
    void shouldRemoveTaskById() {
        Task6_TaskService<Integer> service = new Task6_TaskService<>();

        service.addTask(new Task<>(1, Status.OPEN, Priority.LOW, LocalDate.now()));
        service.removeById(1);

        assertTrue(service.getAll().isEmpty());
    }

    @Test // Фильтрация
    void shouldFilterByStatus() {
        Task6_TaskService service = new Task6_TaskService();

        service.addTask(new Task<>(1, Status.OPEN, Priority.HIGH, LocalDate.now()));
        service.addTask(new Task<>(2, Status.DONE, Priority.MEDIUM, LocalDate.now()));

        List<Task<Integer>> result = service.findByStatus(Status.OPEN);

        assertEquals(1, result.size());
        assertEquals(1, result.get(0).getId());
    }
}
