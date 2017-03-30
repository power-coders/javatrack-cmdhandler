package consoleHandler;

import taskmanagement.TaskList;

import java.util.Scanner;

/**
 * Created by joris on 30.03.17.
 */
public class CompleteTask extends Command {

    public CompleteTask(String name, String description) {
        super(name, description);
    }

    @Override
    public void doAction(TaskList taskList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Task name");
        String name = scanner.nextLine();
        taskList.completeTask(name);
    }
}
