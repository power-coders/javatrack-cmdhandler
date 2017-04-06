package consoleHandler;

import taskmanagement.Task;
import taskmanagement.TaskList;

import java.util.Scanner;

/**
 * Created by joris on 16.03.17.
 */
public class Help extends Command {
    public Help(String name, String description) {
        super(name, description);
    }

    @Override
    public void doAction(TaskList taskList, Scanner scanner) {
        System.out.println("-----------------------------------------------------------------------------");
        System.out.printf("%-20s %-50s", "Command", "Description");
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------");
        Worker.cmdList.forEach(cmd -> {
            System.out.format("%-20s %-50s",
                    cmd.getName(), cmd.getDescription());
            System.out.println();
        });
        System.out.println("-----------------------------------------------------------------------------");
    }


}

