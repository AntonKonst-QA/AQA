package Homework.Work_13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class OutOfStockException extends RuntimeException {
    public OutOfStockException(String message) {
        super(message);
    }
}

class Product {
    private String name;
    private double price;
    private String category;

    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }
}
public class Task5_InventoryService {

    private boolean isInventoryOpen = true;
    private final Map<String, List<Product>> storage = new HashMap<>();

    public void addProduct (Product product) {
        if (!isInventoryOpen) return;
        storage.computeIfAbsent(product.getCategory(), k -> new ArrayList<>())
                .add(product);
    }

    public Product getProductByCategory(String category) {
        List<Product> products = storage.get(category);
        if (products == null || products.isEmpty()) {
            throw new OutOfStockException("No products in category: " + category);
        }
        return products.remove(0);
    }

    public List<Product> filterByPrice(double maxPrice) {
        return storage.values().stream()
                .flatMap(List::stream)
                .filter(p -> p.getPrice() <= maxPrice)
                .collect(Collectors.toList());
    }
}
