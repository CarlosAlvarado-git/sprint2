import java.util.Scanner;
public class Ejercicio25 {
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args)
    {
        int numero = 0;
        String numerosimpares = "";
        int salir = 0;
        System.out.println("Bienvenido al programa que imprime los numeros naturales impares");
        while(salir != 1)
        {
            System.out.println("Ingrese un numero numero entero positivo");
            numero = s.nextInt();
            if(numero < 0)
            {
                System.out.println("Debe de ingresar un numero entero positivo");
            }
            else{
                salir = 1;
            }
        }
        s.close();

        for(int i=0; i<numero; i++)
        {
            if(i % 2 == 1)
           {
               numerosimpares += i +",";
           }
        }
        System.out.println("Los numeros naturales impares menores a "+ numero + " son: " + numerosimpares);
    }
    
}