import java.util.Scanner;
public class ejercicio9 
{
    public static void main(String[] args) 
    {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese numero:");
        num1 = sc.nextInt();

        System.out.print("Ingrese numero:");
        num2 = sc.nextInt();
        
        if(num1 == num2)
        {
            System.out.println(num1+" y "+num2+" son iguales ");
        }
        else
        {
            System.out.println(num1+" y "+num2+" no son iguales ");
        }
    }
}