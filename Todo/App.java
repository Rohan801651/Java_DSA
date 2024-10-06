package Todo;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TodoList todo = new TodoList();

        todo.addTask("Study");
        todo.addTask("play");
        todo.addTask("sleep");
        todo.addTask("walk");
        todo.addTask("dance");
        todo.addTask("see");
        todo.printTask();
        todo.removeTask(2);
        todo.printTask();




    }
}
