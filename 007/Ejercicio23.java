import java.util.Scanner;
public class Ejercicio23 {
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args)
    {
        float pelotasfut = 0;
        float pelotasbeis = 0;
        int salir =1;
        System.out.println("Bienvenido al programa que calcula el precio rebajado de los articulos");
        while(salir != 0)
        {
            System.out.println("Ingrese el precio de la pelota de futbol");
            pelotasfut= s.nextInt();
            System.out.println("Ingrese el precio de la pelota de beisbol");
            pelotasbeis = s.nextInt();
            System.out.println("\nEl precio original de la pelota de futbol es: " +  pelotasfut + "\nEl precio con descuento de la pelota de futbol es: " + (pelotasfut - (pelotasfut * 0.25)));
            System.out.println("\nEl precio original de la pelota de beisbol es: " +  pelotasbeis + "\nEl precio con descuento de la pelota de beisbol es: " + (pelotasbeis -(pelotasbeis * 0.25)));

            System.out.println("\nDesea ingresar otro articulo?");
            System.out.println("0 = No");
            System.out.println("1 = Si");
            System.out.print("\nIngrese su opcion: ");
            salir = s.nextInt();

            if(salir == 0)
            {
                s.close();
            }
        }
    }
    
    
}