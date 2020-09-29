import java.util.Scanner;
public class Ejercicio19 {
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args)
    {
        int numero = 0;
        int resultado = 0;
        String sumasucesiva= "";
        System.out.println("Bienvenido al programa para calcular una suma");
        System.out.println("Ingrese un numero");
        numero = s.nextInt();
        s.close();
        resultado = ((numero)*(numero+1))/2;
        System.out.println("El resultado de la sumatoria es: " + resultado);
    }
}