import java.util.Scanner;
public class Ejercicio21 {
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args)
    {
        int salir = 0;
        int cont = 0;
        int numero = 0;
        int promedio =0;
        System.out.println("Bienvenido al programa de promedios, el programa se acaba cuando ingrese un 0");
        while(salir != 1)
        {
            numero = 0;
            System.out.println("Ingrese el " + (cont+1) + " numero a calcular");
            numero = s.nextInt();
            

            if(numero != 0)
            {
                promedio += numero;
                cont++;
            }
            else{
                salir = 1;
            }
            
        }
        s.close();
        promedio = promedio / cont;
        System.out.println("\nEl promedio de todos los numeros ingresados es: " + promedio);
    }
}