/*
 * A2 - Constructors
 *
 * In this exercise I practiced constructors and constructor
 * overloading by creating Tasks in different ways.
 *
 * I also used static to generate sequential IDs shared between
 * all Task objects, and final so each ID cannot be changed
 * after the object is created.
 *
 * I also practiced using ArrayList, Scanner and separating
 * the application into different classes.
 */

package A2_constructors;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        // Create a Console object and an ArrayList to hold tasks
        Console console = new Console();
        ArrayList<Task> tasks = new ArrayList<>();
        boolean running = true;
        do{
            console.displayBar();
            console.displayMenu();
            console.displayBar();

            int choice = Input.getInt("Enter your choice: ");
            switch (choice) {
                case 1:
                    String description = Input.getString("Enter task description: ");
                    console.displayBar();
                    console.createTask(tasks, description);

                    break;
                case 2:
                    console.displayTasks(tasks);
                    break;
                case 3:
                    console.exit();
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    console.displayBar();
            }


        } while (running);
    }
}
