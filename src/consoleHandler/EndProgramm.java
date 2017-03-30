package consoleHandler;

import com.sun.xml.internal.ws.api.pipe.FiberContextSwitchInterceptor;
import taskmanagement.TaskList;

/**
 * Created by joris on 30.03.17.
 */
public class EndProgramm extends Command{

    public EndProgramm(String name, String description) {
        super(name, description);
    }

    @Override
    public void doAction(TaskList taskList) {
        Worker.scanner.close();
        Worker.done = true;
    }
}
