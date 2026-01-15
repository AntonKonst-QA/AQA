package Homework.Work_13;

import java.util.*;
import java.util.stream.Collectors;

class Movie {
    private final String title;

    public Movie(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Movie)) return false;
        Movie movie = (Movie) o;
        return Objects.equals(title, movie.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }


}

public class Task4_Rating<T extends Number> {
    private final T value;

    public Task4_Rating(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

class MovieService {
    private final Map<Movie, List<Task4_Rating<? extends Number>>> ratings = new HashMap<>();

    public synchronized void addRating(Movie movie, Task4_Rating<? extends Number> rating) {
        double value = rating.getValue().doubleValue();
        if (value < 1 || value > 10) {
            throw new IllegalArgumentException("Rating must be between 1 and 10");
        }
        ratings.computeIfAbsent(movie, k -> new ArrayList<>()).add(rating);
    }

    public double averageRating(Movie movie) {
        return ratings.getOrDefault(movie, List.of()).stream()
                .mapToDouble(r -> r.getValue().doubleValue())
                .average()
                .orElse(0.0);
    }

    public List<Movie> sortByRatingDesc() {
        return ratings.keySet().stream()
                .sorted(Comparator.comparingDouble(this::averageRating).reversed())
                .collect(Collectors.toList());
    }

}