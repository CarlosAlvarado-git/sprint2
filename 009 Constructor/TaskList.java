import java.util.LinkedList; // (https://docs.oracle.com/javase/7/docs/api/java/util/LinkedList.html)
import java.util.Collections; // (https://docs.oracle.com/javase/7/docs/api/java/util/Collections.html)
import java.util.Comparator; // (https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html)

public class TaskList{
    
    /* Do not modify */
    private String name;
    private LinkedList<Task> tasks = new LinkedList<Task>();

    /* Your code here */
    public TaskList(String Nombre, Task tarea)
    {
        this.name = Nombre;
        if (tarea == null){
        }
        else{
            this.tasks.add(tarea);
        }
    }

    public boolean addTask(Task task){
        return this.tasks.add(task);
    }

    public void sortByPriority(){
        Collections.sort(this.tasks, Comparator.comparingInt((Task task) -> task.getPriority()).reversed());
    }

    public void printList(){
        for (int i = 0; i < this.task.size(); i++)
            System.out.println(this.tasks.get(i));
    }

}