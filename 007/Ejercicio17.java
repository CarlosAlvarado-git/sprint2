import java.util.Scanner;
public class Ejercicio17 {

    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args)
    {
        int numero1 = 0;
        int numero2 = 0;
        int resultado = 0;
        String sumasucesiva= "";
        System.out.println("Bienvenido al programa para realizar multiplicaciones");
        System.out.println("Ingrese el primer numero que desea multiplicar");
        numero1 = s.nextInt();
        System.out.println("Ingrese el segundo numero que desea multiplicar");
        numero2 = s.nextInt();
        s.close();
        for(int i = 0; i<numero2; i++)
        {
            resultado += numero1;
            sumasucesiva += numero1;
            sumasucesiva += (i+1 >= numero2)? "=": "+";
        }
    System.out.println(sumasucesiva + resultado);
    }
}