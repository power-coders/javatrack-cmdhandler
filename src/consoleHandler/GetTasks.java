package consoleHandler;

import taskmanagement.TaskList;

import java.util.Scanner;

/**
 * Created by joris on 16.03.17.
 */
public class GetTasks extends Command {
    public GetTasks(String name, String description) {
        super(name, description);
    }

    @Override
    public void doAction(TaskList taskList, Scanner scanner) {
        taskList.printTasks();
    }
}
