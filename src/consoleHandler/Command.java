package consoleHandler;

import taskmanagement.TaskList;

import java.util.Scanner;

/**
 * Created by joris on 16.03.17.
 */
abstract class Command {
    String name;
    String description;
    public Command(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }


    public String getDescription() {
        return description;
    }
    //Abstract Method
    public abstract void doAction(TaskList taskList, Scanner scanner);

}
