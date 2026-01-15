package Homework.Work_13;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

enum Status {
    OPEN, IN_PROGRESS, DONE
}

enum Priority {
    LOW, MEDIUM, HIGH
}

class Task<T> {
    private T id;
    private Status status;
    private Priority priority;
    private LocalDate date;

    public Task(T id, Status status, Priority priority, LocalDate date) {
        this.id = id;
        this.status = status;
        this.priority = priority;
        this.date = date;
    }

    public T getId() {
        return id;
    }

    public Status getStatus() {
        return status;
    }

    public Priority getPriority() {
        return priority;
    }

    public LocalDate getDate() {
        return date;
    }
}

public class Task6_TaskService<T> {
    private final List<Task<T>> tasks = new ArrayList<>();

    public void addTask(Task<T> task) {
        boolean exists = tasks.stream()
                . anyMatch(t -> t.getId().equals(task.getId()));
        if (!exists) {
            tasks.add(task);
        }
    }

    public synchronized void removeById(T id) {
        tasks.removeIf(task -> task.getId().equals(id));
    }

    public List<Task<T>> findByStatus(Status status) {
        return tasks.stream()
                .filter(t -> t.getStatus() == status)
                .collect(Collectors.toList());
    }

    public List<Task<T>> findByPriority(Priority priority) {
        return tasks.stream()
                .filter(t -> t.getPriority() == priority)
                .collect(Collectors.toList());
    }

    public List<Task<T>> sortByDate() {
        return tasks.stream()
                .sorted(Comparator.comparing(Task::getDate))
                .collect(Collectors.toList());
    }

    public List<Task<T>> getAll() {
        return tasks;
    }
}
