import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class Ejercicio22 {
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args)
    {
        int numero1= 0;
        int numero2 = 0;
        System.out.println("Bienvenido al programa que compara dos numero");
        System.out.println("Ingrese el primer numero");
        numero1 = s.nextInt();
        System.out.println("Ingrese el segundo numero");
        numero2 = s.nextInt();
        s.close();
        if(numero1>numero2)
        {
            System.out.println("El numero "+ numero1 + " es mayor que " + numero2);
        }
        else if(numero1 == numero2)
        {
            System.out.println("El numero "+ numero1 + " es igual que " + numero2);
        }
        else{
            System.out.println("El numero "+ numero1 + " es menor que " + numero2);
        }
    }
    
}