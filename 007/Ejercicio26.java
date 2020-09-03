import java.text.DecimalFormat;
import java.util.Scanner;
public class Ejercicio26 {
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args)
    {
     int dividendo = 0;
     int divisor = 0;
     DecimalFormat twoDForm = new DecimalFormat("#.##");
     float cociente = 0;
     int residuo = 0;
     System.out.println("Bienvenido al programa que calcula la division de dos números");   
     System.out.print("Ingrese el dividendo: ");   
     dividendo = s.nextInt();
     System.out.print("Ingrese el divisor: ");  
     divisor = s.nextInt();
     s.close();
     residuo = dividendo; 
     while(residuo >= 0)
     {
        if(residuo - divisor >= 0)
        {
            residuo = residuo - divisor;
            cociente+= 1;
           
        }
        else{
            break;
        }
     }

     if(residuo != 0)
     {
         
         residuo = residuo *10;
         while(residuo >=0)
         {
             if(residuo - divisor >= 0)
             {
                residuo = residuo - divisor;
                cociente+= 0.1;
     
             }
             else{
                 break;
             }
         }
     }

     if(residuo !=0)
     {
        residuo = residuo *10;
        while(residuo >=0)
        {
            if(residuo - divisor>=0)
            {
                residuo = residuo - divisor;
                cociente+= 0.01;
              
            }
            else{
                break;
            }
            
        }
     }

     System.out.print("El resultado de la division es: "+ twoDForm.format(cociente)); 
    }
}