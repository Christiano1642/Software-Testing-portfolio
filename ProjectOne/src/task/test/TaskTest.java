package task.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import task.main.Task;

public class TaskTest {

    @Test
    public void testTaskCreation() {
        Task task = new Task("12345", "Task Name", "Task Description");
        assertEquals("12345", task.getTaskId());
        assertEquals("Task Name", task.getName());
        assertEquals("Task Description", task.getDescription());
    }

    @Test
    public void testTaskCreationInvalidId() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Task(null, "Task Name", "Task Description");
        });
    }

    
}
