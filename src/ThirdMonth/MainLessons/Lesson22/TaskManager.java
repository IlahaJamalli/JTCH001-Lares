package ThirdMonth.MainLessons.Lesson22;
import java.util.PriorityQueue;

public class TaskManager {
    private PriorityQueue<String> taskQueue;

    public TaskManager() {
        taskQueue = new PriorityQueue<>();
    }

    public void addTask(String task) {
        taskQueue.add(task);
    }
    public String getNextTask() {
        return taskQueue.poll();
    }
    public void displayTasks() {
        System.out.println("All tasks: ");
        for (String task : taskQueue) {
            System.out.println(task);
        }
    }

    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        manager.addTask("Back to home");
        manager.addTask("Attend lesson");
        manager.addTask("Complete homework");
        System.out.println("Main Task: " + manager.getNextTask());

        manager.displayTasks();
    }
}
