package consoleHandler;

import taskmanagement.TaskList;

/**
 * Created by joris on 16.03.17.
 */
@FunctionalInterface
public interface ActionInterface {
    public void doAction(TaskList taskList);
}
