package Homework.Work_13;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;


class User {
    private String name;
    private int age;
    private boolean active;

    public User(String name, int age, boolean active) {
        this.name = name;
        this.age = age;
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isActive() {
        return active;
    }

}

public class Task1_EntityManager<T extends User> {
    private final List<T> entities = new CopyOnWriteArrayList<>();

    public void add(T entity) {
        entities.add(entity);
    }

    public boolean remove(T entity) {
        return entities.remove(entity);
    }

    public List<T> getAll() {
        return new ArrayList<>(entities);
    }

    public List<T> filterByAge(int from, int to) {
        return entities.stream()
                .filter(u -> u.getAge() >= from && u.getAge() <= to)
                .collect(Collectors.toList());
    }

    public List<T> filterByName(String name) {
        return entities.stream()
                .filter(u -> u.getName().equalsIgnoreCase(name))
                .collect(Collectors.toList());
    }

    public List<T> filterByActive(boolean active) {
        return entities.stream()
                .filter(u -> u.isActive() == active)
                .collect(Collectors.toList());
    }
}
