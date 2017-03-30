package consoleHandler;

import taskmanagement.Task;
import taskmanagement.TaskList;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by joris on 16.03.17.
 */
public class Worker {
    public static boolean done = false;
    public static Scanner scanner = new Scanner(System.in);
    public static List<Command> cmdList = new ArrayList<>();

    public static void main(String[] args) {
        TaskList taskList = new TaskList();

        //Initialize Commandlist


        //Add Commands
        cmdList.add(new NewTask("new task", "Creates a new Task"));
        cmdList.add(new Help("help", "Prints help"));
        cmdList.add(new GetTasks("get tasks", "Prints all Tasks"));
        cmdList.add(new CompleteTask("complete task", "Sets the status to complete"));
        cmdList.add(new DeleteTasks("delete task", "Removes all matching tasks from the list"));
        cmdList.add(new EndProgramm("end", "Ends the Command Line Tool"));
        cmdList.add(new FindTasks("find task", "Prints all found tasks"));
        cmdList.add(new SortTask("sort tasks", "Sorts Task by name"));

        //Prints all available commands
        cmdList.stream().filter(cmd -> cmd.getName().equals("help")).findFirst().get().doAction(taskList);

        //Loop to ask for User action
        while (!done){

            //Command Line Tool with inheritance
            String command = scanner.nextLine();

            //Find command in commandlist, if not found -> print "Wrong Command"
            boolean foundflag = false;
            for(Command cmd : cmdList){

                if(cmd.getName().equals(command)) {
                    cmd.doAction(taskList);
                    foundflag = true;
                }
            }
            if(!foundflag) System.out.println("Wrong Command");



            //Switch Case Command Line Tool

           /* switch (command){
                case "new task":{
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
                    System.out.println("Enter Task name");
                    String taskname = scanner.nextLine();
                    System.out.println("Enter a startdate like dd/mm/yyyy");
                    String startDate = scanner.nextLine();
                    System.out.println("Enter a duedate like dd/mm/yyyy");
                    String dueDate = scanner.nextLine();

                    taskList.addTask(taskname, LocalDate.parse(startDate, formatter), LocalDate.parse(dueDate, formatter));
                    break;
                }
                case "get task":{
                    taskList.printTasks();
                    break;
                }
                case "help":{
                    System.out.println(printCommand());
                    break;
                }
                case "end":{
                    System.out.println("end");
                    done = true;
                    scanner.close();
                    break;
                }
            }*/


        }

    }

}
