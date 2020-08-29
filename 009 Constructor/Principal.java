import java.util.Scanner;
public class Principal{
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        int detenerse = 0;
        while(detenerse != 1)
        {
            System.out.println("Menú:");
            System.out.print("1. Agregar task.\n2. Enlistar task \n3. Salir\n");
            if(teclado.hasnextInt() == true){
                int respuesta = teclado.nextInt();
                teclado.nextLine(); //teclado.next();
            }
            else{
                respuesta = 0;
            }
            if( respuesta == 1){
                //menú de las formas de task.
                //crear la task y agregarla a la lista.
            }
            else if(respuesta == 2){
                //print listas
            }
            else if(respuesta == 3){
                detenerse = 1;
                teclado.close();
            }
            else{
                System.out.println("Ingrese sólo los número 1-2-3 con respecto a la accion que desee realizar.")
            }
        }
    }
}