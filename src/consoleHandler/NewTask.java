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

    public void doAction(TaskList taskList, Scanner scanner) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        System.out.println("Enter Task name");
        String taskname = scanner.nextLine();
        System.out.println("Enter a startdate like dd/mm/yyyy");
        String startDate = scanner.nextLine();
        if(!startDate.matches("^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[1,3-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$")){
            System.out.println("Wrong Date");

        }else {
            System.out.println("Enter a duedate like dd/mm/yyyy");
            String dueDate = scanner.nextLine();
            if(!dueDate.matches("^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[1,3-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$")){
                System.out.println("Wrong Date");
            }else {

                taskList.addTask(taskname, LocalDate.parse(startDate, formatter), LocalDate.parse(dueDate, formatter));
            }
        }


    }
}
