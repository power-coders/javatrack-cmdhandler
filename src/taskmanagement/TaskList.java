package taskmanagement;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by joris on 30.03.17.
 */
public class TaskList {
    List<Task> tasklist = new ArrayList<>();


    public void addTask(String name, LocalDate startDate, LocalDate dueDate){
        tasklist.add(new Task(name,startDate,dueDate));
    }

    public void sortTaskbyName(){
        tasklist.sort((t1,t2)-> t1.getName().compareTo(t2.getName()));

    }
    public void sortTaskbyDate(){
        tasklist.sort((t1,t2) -> t1.getDueDate().compareTo(t2.getDueDate()));
    }

    public void completeTask(String name){
        findByName(name).forEach(t -> {
            t.setDone();
            System.out.println("Task completed: " + t.getName());
        });
    }

    public List<Task> findByName(String name){

        List<Task> filteredList = new ArrayList<>();


        //example 1
        /*for (Task task : tasklist) {
            if(task.getName().equals(name)){
                filteredList.add(task);
            }
        }

        //example 2 java 8
        tasklist.forEach(task -> {
            if(task.getName().equals(name)){
                filteredList.add(task);
            }
        });*/

        //example 3 java 8 with streams
        return tasklist.stream().filter(task -> task.getName().equals(name)).collect(Collectors.toList());
        //return filteredList;
    }


    public void deleteTaskExample1(String name){
        tasklist = tasklist.stream().filter(task -> !task.getName().equals(name)).collect(Collectors.toList());
    }

    public void deleteTaskExample2(String name){
        tasklist.forEach(task -> {
            if(task.getName().equals(name)){
                tasklist.remove(task);
            }
        });
    }

    public void printTasks(){
        tasklist.stream().forEach(System.out::println);
    }





}
