package annotations.beginnerlevel.todoannotations;

public class ProjectTasks {

    @Todo(task = "Implement user authentication", assignedTo = "Alice", priority = "HIGH")
    public void implementAuth() {
        System.out.println("Working on user authentication...");
    }

    @Todo(task = "Optimize database queries", assignedTo = "Bob")
    public void optimizeQueries() {
        System.out.println("Optimizing database queries...");
    }

    @Todo(task = "Add logging functionality", assignedTo = "Charlie", priority = "LOW")
    public void addLogging() {
        System.out.println("Adding logging functionality...");
    }

    public void completedTask() { // Not annotated
        System.out.println("This task is already completed.");
    }
}
