package A2_constructors;

import java.util.ArrayList;

public class Console {
private final String menu = "1. Create a new task\n2. View all tasks\n3. Exit";

    public void displayMenu() {
        System.out.println(menu);
    }

    public void displayTasks(ArrayList<Task> tasks) {
        System.out.println("Tasks:");
        for (Task task : tasks) {
            System.out.printf("ID: %03d, Description: %s%n", task.getID(), task.getDescription());
        }
    }

    public void createTask(ArrayList<Task> tasks, String description) {
        Task task = new Task(description);
        tasks.add(task);

        System.out.println("Task created with ID: " + task.getID());
    }

    public void exit() {
        System.out.println("Exiting the application.");
    }

    public void displayBar() {
        System.out.println("=".repeat(35));
    }
}
