package List.OperacoesBasicas;


public class App {
    public static void main(String[] args) {
        TaskList taskList = new TaskList();

        taskList.addTask("1");
        taskList.addTask("2");
        taskList.addTask("3");
        taskList.addTask("4");
        taskList.addTask("1");
        taskList.addTask("1");
        taskList.addTask("1");
        taskList.addTask("2");

        System.out.println(taskList.getTaskList().size());

        taskList.getTasksDescriptions();

        taskList.deleteTask("1");

        System.out.println(taskList.getTaskList().size());
    
        taskList.getTasksDescriptions();
    }
}
