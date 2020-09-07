import java.util.Scanner;
public class ejercicio11
{
    public static void main(String[] args) 
    {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese numero para verificar si es par o impar:");
        num = sc.nextInt();
        
        if(num % 2 == 0)
        {
            System.out.println("El numero "+num+" es par ");
        }
        else
        {
            System.out.println("El numero  "+num+" es impar ");
	}
    }
}