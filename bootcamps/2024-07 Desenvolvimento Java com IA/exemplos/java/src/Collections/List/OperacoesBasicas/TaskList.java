package List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private List<Task> tasks;

    public TaskList() {
        this.tasks = new ArrayList<>();
    }

    public List<Task> getTaskList() {
        return tasks;
    }

    public void addTask(String description){
        tasks.add(new Task(description));
    }
   
    public void deleteTask(String description) {
        List<Task> tasksToRemove = new ArrayList<>();
        
        for (Task task : tasks) {
            if (task.getDescription().equalsIgnoreCase(description)) {
                tasksToRemove.add(task);
            }
        }
        tasks.removeAll(tasksToRemove);
    }

    public int getListSize() {
        return tasks.size();
    }

    public void getTasksDescriptions() {
        System.out.println(tasks);
    }
}
