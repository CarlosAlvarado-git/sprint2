import java.util.Scanner;
import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;
import java.text.ParseException;
public class Principal{
    static Scanner teclado = new Scanner(System.in);
    static TaskList Listado = new TaskList("Listado", null);
    static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    public static void main(String[] args) {
        int detenerse = 0;
        int respuesta = 0;
        int respuesta2 = 0;
        
        while(detenerse != 1)
        {
            int prioridad = 0;
            String notas = "";
            String mensaje = "";
            Date fecha = new Date();
            System.out.println("Menú:");
            System.out.print("1. Agregar task.\n2. Enlistar task \n3. Información o Modificación de Task\n4. Salir\n");
            if(teclado.hasNextInt() == true){
                respuesta = teclado.nextInt();
                teclado.nextLine(); //teclado.next();
            }
            if( respuesta == 1){
                System.out.print("1. Task solo con Fecha\n 2.Task solo con Fecha, prioridad y fecha de realizar\n 3. Task con todo\n");
                if(teclado.hasNextInt() == true){
                    respuesta2 = teclado.nextInt();
                    teclado.nextLine(); //teclado.next();
                }
                else{
                    System.out.println("Ingrese sólo los número 1-2-3 con respecto al tipo de task que desee crea. Volverá al menú principal");
                }
                if( respuesta2 == 1){
                    System.out.print("Ingrese el msg_reminder: ");
                    mensaje = teclado.nextLine();
                    Task t = new Task(mensaje, fecha, prioridad, notas);
                    Listado.addTask(t);
                }
                else if(respuesta2 == 2){
                    System.out.print("Ingrese el msg_reminder: ");
                    mensaje = teclado.nextLine();
                    System.out.print("Ingrese la prioridad de la tarea: ");
                    prioridad = teclado.nextInt();
                    teclado.nextLine();
                    System.out.print("Ingrese la fecha yyyy-MM-dd: ");
                    String fec = teclado.nextLine();
                    try {
                        fecha = format.parse(fec);
                    } catch (ParseException e) {
                        //e.printStackTrace();
                        System.out.println("Ha ingresado mal la fecha, entonces se quedara con la del HOY");
                    }
                    Task t = new Task(mensaje, fecha, prioridad, notas);
                    Listado.addTask(t);
                }
                else if(respuesta2 == 3){
                    System.out.print("Ingrese el msg_reminder: ");
                    mensaje = teclado.nextLine();
                    System.out.print("Ingrese la prioridad de la tarea: ");
                    prioridad = teclado.nextInt();
                    teclado.nextLine();
                    System.out.print("Ingrese la fecha yyyy-MM-dd: ");
                    String fec = teclado.nextLine();
                    try {
                        fecha = format.parse(fec);
                    } catch (ParseException e) {
                        //e.printStackTrace();
                        System.out.println("Ha ingresado mal la fecha, entonces se quedara con la del HOY");
                    }
                    System.out.print("Ingrese nota: ");
                    notas = teclado.nextLine();
                    Task t = new Task(mensaje, fecha, prioridad, notas);
                    Listado.addTask(t);
                }
                else
                {
                    System.out.println("Ingrese sólo los número 1-2-3 con respecto al tipo de task que desee crea. Volverá al menú principal");                   
                }
                //menú de las formas de task.
                //crear la task y agregarla a la lista.
            }
            else if(respuesta == 2){
                //print listas
                Listado.printList();
            }
            else if(respuesta == 3){
                Listado.printList();
                System.out.print("Escoja la task: ");
                int posi = teclado.nextInt();
                teclado.nextLine();
                System.out.print("Que quiere realizar:\n 1. Ver prioridad de task\n 2. Ver status de task\n 3. Ver notas de task\n 4. Modificar task a Done\n 5. Obtener fecha de entrega\n");
                int r = teclado.nextInt();
                teclado.nextLine();
                if(r == 1){
                    Task task1 = Listado.obtenerTask(posi-1);
                    if(task1 != null){
                        int p = task1.getPriority();
                        System.out.println("La prioridad de la taks es: " + p);
                    }
                    else{
                        System.out.println("La task que ingreso no existe");
                    }
                    
                }
                else if(r == 2){
                    Task task1 = Listado.obtenerTask(posi-1);
                    if(task1 != null)
                    {
                        boolean p = task1.getStatus();
                        System.out.println("El status de la taks es: " + p);
                    }
                    else{
                        System.out.println("La task que ingreso no existe");
                    }
                }
                else if(r == 3)
                {
                    Task task1 = Listado.obtenerTask(posi-1);
                    if(task1 != null)
                    {
                        String p = task1.getNotes();
                        System.out.println("Las notas de la taks son: " + p);
                    }
                    else{
                        System.out.println("La task que ingreso no existe");
                    }
                }
                else if(r == 4){
                    Task task1 = Listado.obtenerTask(posi-1);
                    if(task1 != null)
                    {
                        task1.markAsDone();
                        Listado.addTask(task1);
                        Listado.Remover(posi-1);
                        System.out.println("Ya se ha modificado a Done la: " + task1); 
                    }
                    else{
                        System.out.println("La task que ingreso no existe");
                    }
                }
                else if(r == 5){
                    Task task1 = Listado.obtenerTask(posi-1);
                    if(task1 != null)
                    {
                        String p = task1.getTaskDate();
                        System.out.println("La fecha de entrega de la taks son: " + p);
                    }
                    else
                    {
                        System.out.println("La task que ingreso no existe");
                    }
                }
                else{
                    System.out.println("Ingrese sólo los valores del 1 al 5 del menú. Regresará al menú principal");
                }
                
            }
            else if(respuesta == 4){
                detenerse = 1;
                teclado.close();
            }
            else{
                System.out.println("Ingrese sólo los número 1-2-3 con respecto a la accion que desee realizar.");
            }
        }
    }
}