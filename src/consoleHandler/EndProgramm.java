package consoleHandler;

import com.sun.xml.internal.ws.api.pipe.FiberContextSwitchInterceptor;
import taskmanagement.TaskList;

import java.util.Scanner;

/**
 * Created by joris on 30.03.17.
 */
public class EndProgramm extends Command{

    public EndProgramm(String name, String description) {
        super(name, description);
    }

    @Override
    public void doAction(TaskList taskList, Scanner scanner) {
        scanner.close();
        Worker.done = true;
    }
}
