import java.util.Scanner;
public class ejercicio12 {

    
  public static void main(String[] args)
    {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese numero: ");
        num = sc.nextInt();

        if(20 <= num && num <= 200)

        {
            System.out.println("El numero "+num+" si se encuentra en rango");
        }
        else
        {
            System.out.println("El numero "+num+" no se encuentra en rango");
        }
    }
}