package Homework.Work_13;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import static org.junit.jupiter.api.Assertions.*;


public class Task1_EntityManagerTest {

    private Task1_EntityManager<User> checker;

    @BeforeEach
    void setUp() {
        checker = new Task1_EntityManager<>();
    }
    @Test //Тест добавления
    void shouldAddEntity() {

        User user = new User("Anton", 38, true);
        checker.add(user);

        assertEquals(1, checker.getAll().size());
    }

    @Test //Тест удаления
    void shouldRemoveExistingEntity() {
        User user = new User("Anton", 38, true);

        checker.add(user);
        boolean removed = checker.remove(user);

        assertTrue(removed);
        assertTrue(checker.getAll().isEmpty());
    }

    @Test //Проверка false
    void shouldReternFalseEntityNotFound() {
        assertFalse(checker.remove(new User("Антон", 130, false)));
    }

    @Test //Тест фильтрации
    void shouldFilterByAgeRange() {
        checker.add(new User("А", 10, true));
        checker.add(new User("Б", 20, true));
        checker.add(new User("В", 30, false));

        List<User> result = checker.filterByAge(15, 25);

        assertEquals(1, result.size());
        assertEquals("Б", result.get(0).getName());
    }
}
