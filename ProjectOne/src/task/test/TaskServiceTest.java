package task.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import task.main.Task;
import task.main.TaskService;

public class TaskServiceTest {

    private TaskService taskService;

    @BeforeEach
    public void setUp() {
        taskService = new TaskService();
    }

    @Test
    public void testAddTask() {
        Task task = new Task("12345", "Task Name", "Task Description");
        taskService.addTask(task);
        assertNotNull(taskService.getTask("12345"));
    }

    @Test
    public void testDeleteTask() {
        Task task = new Task("12345", "Task Name", "Task Description");
        taskService.addTask(task);
        taskService.deleteTask("12345");
        assertNull(taskService.getTask("12345"));
    }

    @Test
    public void testUpdateTask() {
        Task task = new Task("12345", "Task Name", "Task Description");
        taskService.addTask(task);
        taskService.updateTask("12345", "New Name", "New Description");
        Task updatedTask = taskService.getTask("12345");
        assertEquals("New Name", updatedTask.getName());
        assertEquals("New Description", updatedTask.getDescription());
    }

    
}

