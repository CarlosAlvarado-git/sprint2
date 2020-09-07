import java.util.Scanner;
public class ejercicio15 
{
    public static void main(String[] args) 
    {
        int num, x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese numero para el cual desea la tabla de multiplicación:");        
        num = sc.nextInt();
        for(x=1; x <= 10; x++)
        {
            System.out.println(num+" * "+x+" = "+num*x);
        }
    }
}