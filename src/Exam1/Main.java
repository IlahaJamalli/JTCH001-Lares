package Exam1;

public class Main {
    public static void main(String[] args)  {
        TaskManager taskManager = new TaskManager();
        Task task1=new Task("hw1", PriorityLevel.LOW, TaskStatus.IN_PROGRESS);
        Task task2=new Task("hw2", PriorityLevel.HIGH, TaskStatus.COMPLETED );

        try {
            taskManager.addTasks(task1);
        } catch (DuplicateTaskException e) {
            throw new RuntimeException(e);
        }
        try {
            taskManager.addTasks(task2);
        } catch (DuplicateTaskException e) {
            throw new RuntimeException(e);
        }
        taskManager.displayAllTasks(TaskStatus.COMPLETED);
    }
}
