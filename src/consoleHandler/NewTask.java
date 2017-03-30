package consoleHandler;

import taskmanagement.TaskList;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Created by joris on 16.03.17.
 */
public class NewTask extends Command {

    public NewTask(String name, String description) {
        super(name, description);
    }

    public void doAction(TaskList taskList) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Task name");
        String taskname = scanner.nextLine();
        System.out.println("Enter a startdate like dd/mm/yyyy");
        String startDate = scanner.nextLine();
        System.out.println("Enter a duedate like dd/mm/yyyy");
        String dueDate = scanner.nextLine();

        taskList.addTask(taskname, LocalDate.parse(startDate, formatter), LocalDate.parse(dueDate, formatter));


    }
}
