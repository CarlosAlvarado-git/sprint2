import java.util.Scanner;

import java.util.Scanner;
public class Ejercicio18 {
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args)
    {
        int numero = 0;
        float primo = 0;
        System.out.println("Bienvenido al programa para determinar si un numero es primo o no");
        System.out.println("Ingrese un numero");
        numero = s.nextInt();
        s.close();
        for(int i =1; i<numero + 1; i++)
        {
            if(numero % i == 0)
            {
                primo += 1;
            }
        }
        if(primo == 2)
        {
            System.out.println("El numero " + numero + " es primo");
        }
        else{
            System.out.println("El numero " + numero + " no es primo");
        }

    }
}