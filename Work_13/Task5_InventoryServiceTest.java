package Homework.Work_13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task5_InventoryServiceTest {
    @Test
    void shouldNotAddProductWhenInventoryClosed() {
        Task5_InventoryService service = new Task5_InventoryService();
        service.setInventoryOpen(false);

        service.addProduct((new Product("Бананы", 10, "Еда")));

        assertTrue(service.getAll().isEmpty());
    }

    @Test
    void shouldThrowExceptionWhenOutOfStock() {
        Task5_InventoryService service = new Task5_InventoryService();

        assertThrows(OutOfStockException.class, () -> service.getProductByCategory("Еда"));
    }
}
