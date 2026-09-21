package A2_constructors;

public class Task {
    private static int numId = 0; // Static variable to keep track of the number of tasks created
    private final int id;
    private String description;

    // Constructor overloading
    public Task() {
        this.id = ++numId;
        this.description = "";
    }

    public Task(String description) {
        this.id = ++numId;
        this.description = description;
    }

    // Getters
    public int getID() {
        return id;
    }

    public String getDescription() {
        return description;
    }
}