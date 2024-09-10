package Exam1;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks;

    public TaskManager(List<Task> tasks) {
        this.tasks = new ArrayList<>();
    }

    public TaskManager() {

    }

    public void addTasks(Task task) throws DuplicateTaskException {

        for (Task t: tasks ){
            if(t.getName().equals(task.getName())){
                throw new DuplicateTaskException(task.getName());
            }
        } tasks.add(task);
    }

    public void removeTask(Task task){
        for (Task t: tasks ){
            if(t.getName().equals(task.getName())){
                tasks.remove(task);
            }
        }
    }
    public void displayStatus(Task task){
        for (Task t: tasks ){
            if(t.getStatus().equals(task.getStatus())){
                System.out.println(t);
            }
        }
    }

    public void updateStatus(String name, TaskStatus taskStatus){
        for (Task t: tasks ){
            if(t.getName().equals(name)){
                t.setStatus(taskStatus);
           }
           else {
                System.out.println("Task" + name + " do not found");
            }
        }

    }
    public void displayAllTasks(TaskStatus taskStatus){
        int newCount= 0;
        int inProgress = 0;
        int completed = 0;
        for (Task task : tasks){
            task.getStatus().equals(TaskStatus.NEW);
            newCount++;
        }
        for (Task task : tasks){
            task.getStatus().equals(TaskStatus.IN_PROGRESS);
            inProgress++;
        }
        for (Task task : tasks){
            task.getStatus().equals(TaskStatus.COMPLETED);
            completed++;
        }
        System.out.println(newCount);
        System.out.println(inProgress);
        System.out.println(completed);


    }

}
