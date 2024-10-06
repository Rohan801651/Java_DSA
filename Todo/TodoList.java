package Todo;

import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> todoList = new ArrayList<String>();

    public void addTask(String task) {
        todoList.add(task);
    }

    public void removeTask(int taskPosition) {
        todoList.remove(taskPosition-1);
    }






    public void printTask() {
        System.out.println(todoList);
    }


}
