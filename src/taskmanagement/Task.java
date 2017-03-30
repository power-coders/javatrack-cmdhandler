package taskmanagement;

import java.time.LocalDate;

/**
 * Created by joris on 23.03.17.
 */
public class Task {
    String name;
    LocalDate startDate;
    LocalDate dueDate;
    int progress;
    boolean completion;
    String description;

    public void Task(String name,LocalDate startDate, LocalDate dueDate,
                     int progress, boolean completion, String description){
        this.name=name;
        this.startDate=startDate;
        this.dueDate=dueDate;
        this.progress=0;
        this.completion=completion;
        this.description=description;


    }
    // this is the constuctor
    public Task(String name, LocalDate startDate, LocalDate dueDate) {
        this.name = name;
        this.startDate = startDate;
        this.dueDate = dueDate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isdone(){
        return this.completion;
    }


    public void setDone(){
        this.completion=true;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", startDate=" + startDate +
                ", dueDate=" + dueDate +
                ", progress=" + progress +
                ", completion=" + completion +
                ", description='" + description + '\'' +
                '}';
    }


}
