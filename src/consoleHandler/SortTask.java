package consoleHandler;

import taskmanagement.TaskList;

/**
 * Created by joris on 30.03.17.
 */
public class SortTask extends Command {

    public SortTask(String name, String description) {
        super(name, description);
    }

    @Override
    public void doAction(TaskList taskList) {
        taskList.sortTaskbyName();
    }
}
