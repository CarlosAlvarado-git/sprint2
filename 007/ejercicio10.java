import java.util.Scanner;

public class ejercicio10
{
    public static void main(String args[])
    {
        int num1, num2, mayor;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese numero: ");
        num1 = sc.nextInt();
        
        System.out.println("Ingrese numero ");
        num2 = sc.nextInt();
		
        if(num1>num2)
        {
            mayor = num1;
        }
        else
        {
            mayor = num2;
        }
		
        System.out.print("El numero mayor es: " +mayor);
    }
}