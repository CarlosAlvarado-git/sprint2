import java.util.Scanner;
public class ejercicio13 

{
   public static void main(String[] args)
    {
       int bisiestro;
       Scanner sc = new Scanner(System.in);
       System.out.print("Ingresar año:");
       bisiestro = sc.nextInt();

       if((bisiestro % 400 == 0) || ((bisiestro % 4 == 0) && (bisiestro % 100 != 0)))
               System.out.println("EL año " + bisiestro + " es bisiestro");
       else
               System.out.println("El año " + bisiestro + " no es bisiestro");
    }
}