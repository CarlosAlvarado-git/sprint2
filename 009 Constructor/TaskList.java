import java.util.LinkedList; // (https://docs.oracle.com/javase/7/docs/api/java/util/LinkedList.html)

import jdk.nashorn.internal.ir.ReturnNode;

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
    public Task obtenerTask(int posi){
        if(this.tasks.size() > 0){
            if(posi >= 0){
                if(this.tasks.get(posi) == null){
                    return null;
                }
                return this.tasks.get(posi);
            }
            else{
                return null;
            }            
        }
        else
        {
            return null;
        }
        
    }
    public void Remover(int posi){
        this.tasks.remove(posi);
    }
    public void sortByPriority(){
        Collections.sort(this.tasks, Comparator.comparingInt((Task task) -> task.getPriority()).reversed());
    }

    public void printList(){
        sortByPriority();
        System.out.println("El listado de:" + name);
        for (int i = 0; i < this.tasks.size(); i++)
            System.out.println("#"+ (i+1) +this.tasks.get(i));
    }

}