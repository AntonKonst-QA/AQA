package Homework.Work_13;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task4_RatingTest {
    @Test //Добавляем рейтинг
    void shouldAddRatingToMovie() {
        MovieService service = new MovieService();
        Movie movie = new Movie("Чебурашка");

        service.addRating(movie, new Task4_Rating<>(9));

        assertEquals(9.0, service.averageRating(movie));
    }

    @Test //Средняя оценка
    void shouldCalculateAverageRating() {
        MovieService service = new MovieService();
        Movie movie = new Movie("Чебурашка продолжение");

        service.addRating(movie, new Task4_Rating<>(8));
        service.addRating(movie, new Task4_Rating<>(10));

        assertEquals(9.0, service.averageRating(movie));
    }

    @Test //Сортировка по убыванию
    void shouldSortMoviesByRatingDesc() {
        MovieService service = new MovieService();

        Movie m1 = new Movie("A");
        Movie m2 = new Movie("B");

        service.addRating(m1, new Task4_Rating<>(5));
        service.addRating(m2, new Task4_Rating<>(9));

        List<Movie> sorted = service.sortByRatingDesc();

        assertEquals("B", sorted.get(0).getTitle());
        assertEquals("A", sorted.get(1).getTitle());
    }

    @Test //Невалидный рейтинг
    void shouldThrowExceptionForInvalidRating() {
        MovieService service = new MovieService();
        Movie movie = new Movie("Чебурашка");

        assertThrows(IllegalArgumentException.class, () -> service.addRating(movie, new Task4_Rating<>(11)));
    }
}
