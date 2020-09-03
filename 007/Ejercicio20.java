import java.util.Scanner;
public class Ejercicio20 {
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args)
    {
        int numero = 0;
        int cont = 0;
        int cont2 = 1;
        String numerosimpares = "";
        System.out.println("Bienvenido al programa para que imprime los numeros impares");
        System.out.println("Ingrese un numero");
        numero = s.nextInt();
        s.close();
        while(cont < numero)
        {
           if(cont2 % 2 == 1)
           {
               numerosimpares += cont2+ ",";
               cont++;
           }
           cont2++;
        }
        System.out.println(numerosimpares);
    }
    
}