import java.util.Scanner;
public class ejercicio8 {

    
  public static void main(String[] args)
    {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese numero: ");
        num = sc.nextInt();

        if (num == 7)
        {
            System.out.println("Numero de la suerte");
        }
        else
        {
            System.out.println("Hoy no es tu dia de suerte ");
        }
    }
}

