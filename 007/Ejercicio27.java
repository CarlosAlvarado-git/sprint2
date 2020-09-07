import java.util.*;
import java.lang.Character; 

public class Ejercicio27 {
    
    static Scanner teclado = new Scanner(System.in); 

    static public void main(String[] argument){
        String nombre;
        int i;  
        char[] caracteres; 
        int count = 0; 
        int j = 0; 
        
        System.out.println("Inserte el nombre: "); 
        nombre = teclado.nextLine(); 
        System.out.println("Nombre: " + nombre);
        caracteres =  nombre.toCharArray(); 

        //Covierte al primer caracter a mayúscula, sino lo es. 
        if (caracteres[0] > 96)
        { 
            char a = caracteres[0]; 
            caracteres[0] = Character.toUpperCase(a); 
        }

        //Cuanta la cantidad de inciales que tiene el array con los caracteres completos
        int size = caracteres.length; 
        for(i = 0; i < size ; i++)
        {    
            if(caracteres[i] < 97  && caracteres[i] != 32)
            {
                count++; 
            }
        }
        
        char[] iniciales = new char[count]; 

        //Rellena el array solo con las inciales
        for(i = 0; i < size; i++)
        {     
            if(caracteres[i] < 97 && caracteres[i] != 32)
            {
                iniciales[j] = caracteres[i]; 
                j++; 
            }
        }
        
        //Imprime el array de mayúsculas 
        System.out.print("Iniciales: "); 
        for(i = 0; i < count; i++)
        {     
            System.out.print(iniciales[i]); 
        }
        System.out.print("\n"); 

        //Recorre el array de mayúculas 7 veces para imprimir línea por línea inicial
        for(j = 0; j < 7; j++)
        {    
            for(i = 0; i < count; i++)
            {

                switch (iniciales[i])
                {
                    case 'A': 
                        if( j == 0){
                            System.out.print("*****     "); 
                        }
                        else if(j == 1){
                            System.out.print("*   *     "); 
                        }
                        else if(j == 2){
                            System.out.print("*   *     "); 
                        }
                        else if(j == 3){
                            System.out.print("*****     "); 
                        }
                        else if(j == 4){
                            System.out.print("*   *     ");
                        }
                        else if(j == 5){
                            System.out.print("*   *     "); 
                        }
                        else if(j == 6){
                            System.out.print("*   *     "); 
                        }
                        break; 

                    case 'B': 
                        if( j == 0){
                            System.out.print("*****     "); 
                        }
                        else if(j == 1){
                            System.out.print("*   *     "); 
                        }
                        else if(j == 2){
                            System.out.print("* *       "); 
                        }
                        else if(j == 3){
                            System.out.print("***       "); 
                        }
                        else if(j == 4){
                            System.out.print("*  *      ");
                        }
                        else if(j == 5){
                            System.out.print("*   *     "); 
                        }
                        else if(j == 6){
                            System.out.print("*****     "); 
                        } 
                        break; 

                    case 'C': 
                        if( j == 0){
                            System.out.print("*****     "); 
                        }
                        else if(j == 1){
                            System.out.print("*         "); 
                        }
                        else if(j == 2){
                            System.out.print("*         "); 
                        }
                        else if(j == 3){
                            System.out.print("*         "); 
                        }
                        else if(j == 4){
                            System.out.print("*         ");
                        }
                        else if(j == 5){
                            System.out.print("*         "); 
                        }
                        else if(j == 6){
                            System.out.print("*****     "); 
                        } 
                        break;

                    case 'D': 
                        if( j == 0){
                            System.out.print("****      "); 
                        }
                        else if(j == 1){
                            System.out.print("*   *     "); 
                        }
                        else if(j == 2){
                            System.out.print("*   *     "); 
                        }
                        else if(j == 3){
                            System.out.print("*   *     "); 
                        }
                        else if(j == 4){
                            System.out.print("*   *     ");
                        }
                        else if(j == 5){
                            System.out.print("*   *     "); 
                        }
                        else if(j == 6){
                            System.out.print("****      "); 
                        } 
                        break;

                    case 'E': 
                        if( j == 0){
                            System.out.print("*****     "); 
                        }
                        else if(j == 1){
                            System.out.print("*         "); 
                        }
                        else if(j == 2){
                            System.out.print("*         "); 
                        }
                        else if(j == 3){
                            System.out.print("*****     "); 
                        }
                        else if(j == 4){
                            System.out.print("*         ");
                        }
                        else if(j == 5){
                            System.out.print("*         "); 
                        }
                        else if(j == 6){
                            System.out.print("*****     "); 
                        } 
                        break;
                    
                    case 'F': 
                        if( j == 0){
                            System.out.print("*****     "); 
                        }
                        else if(j == 1){
                            System.out.print("*         "); 
                        }
                        else if(j == 2){
                            System.out.print("*         "); 
                        }
                        else if(j == 3){
                            System.out.print("*****     "); 
                        }
                        else if(j == 4){
                            System.out.print("*         ");
                        }
                        else if(j == 5){
                            System.out.print("*         "); 
                        }
                        else if(j == 6){
                            System.out.print("*         "); 
                        }
                        break;
                        
                    case 'G': 
                        if( j == 0){
                            System.out.print("*****     "); 
                        }
                        else if(j == 1){
                            System.out.print("*         "); 
                        }
                        else if(j == 2){
                            System.out.print("*         "); 
                        }
                        else if(j == 3){
                            System.out.print("* ***     "); 
                        }
                        else if(j == 4){
                            System.out.print("*   *     ");
                        }
                        else if(j == 5){
                            System.out.print("*   *     "); 
                        }
                        else if(j == 6){
                            System.out.print("*****     "); 
                        }
                        break;

                    case 'H': 
                        if( j == 0){
                            System.out.print("*   *     "); 
                        }
                        else if(j == 1){
                            System.out.print("*   *     "); 
                        }
                        else if(j == 2){
                            System.out.print("*   *     "); 
                        }
                        else if(j == 3){
                            System.out.print("*****     "); 
                        }
                        else if(j == 4){
                            System.out.print("*   *     ");
                        }
                        else if(j == 5){
                            System.out.print("*   *     "); 
                        }
                        else if(j == 6){
                            System.out.print("*   *     "); 
                        } 
                        break; 

                    case 'I': 
                        if( j == 0){
                            System.out.print("*****     "); 
                        }
                        else if(j == 1){
                            System.out.print("  *       "); 
                        }
                        else if(j == 2){
                            System.out.print("  *       "); 
                        }
                        else if(j == 3){
                            System.out.print("  *       "); 
                        }
                        else if(j == 4){
                            System.out.print("  *       ");
                        }
                        else if(j == 5){
                            System.out.print("  *       "); 
                        }
                        else if(j == 6){
                            System.out.print("*****     "); 
                        } 
                        break; 

                    case 'J': 
                        if( j == 0){
                            System.out.print("*****     "); 
                        }
                        else if(j == 1){
                            System.out.print("    *     "); 
                        }
                        else if(j == 2){
                            System.out.print("    *     "); 
                        }
                        else if(j == 3){
                            System.out.print("    *     "); 
                        }
                        else if(j == 4){
                            System.out.print("    *     ");
                        }
                        else if(j == 5){
                            System.out.print("*   *     "); 
                        }
                        else if(j == 6){
                            System.out.print("*****     "); 
                        } 
                        break;

                    case 'K': 
                        if( j == 0){
                            System.out.print("*   *     "); 
                        }
                        else if(j == 1){
                            System.out.print("*  *      "); 
                        }
                        else if(j == 2){
                            System.out.print("**        "); 
                        }
                        else if(j == 3){
                            System.out.print("*         "); 
                        }
                        else if(j == 4){
                            System.out.print("**        ");
                        }
                        else if(j == 5){
                            System.out.print("*  *      "); 
                        }
                        else if(j == 6){
                            System.out.print("*   *     "); 
                        }
                        break;

                    case 'L': 
                        if( j == 0){
                            System.out.print("*         "); 
                        }
                        else if(j == 1){
                            System.out.print("*         "); 
                        }
                        else if(j == 2){
                            System.out.print("*         "); 
                        }
                        else if(j == 3){
                            System.out.print("*         "); 
                        }
                        else if(j == 4){
                            System.out.print("*         ");
                        }
                        else if(j == 5){
                            System.out.print("*         "); 
                        }
                        else if(j == 6){
                            System.out.print("*****     "); 
                        } 
                        break;
                    
                    case 'M': 
                        if( j == 0){
                            System.out.print("*   *     "); 
                        }
                        else if(j == 1){
                            System.out.print("** **     "); 
                        }
                        else if(j == 2){
                            System.out.print("* * *     "); 
                        }
                        else if(j == 3){
                            System.out.print("*   *     "); 
                        }
                        else if(j == 4){
                            System.out.print("*   *     ");
                        }
                        else if(j == 5){
                            System.out.print("*   *     "); 
                        }
                        else if(j == 6){
                            System.out.print("*   *     "); 
                        } 
                        break;
                        
                    case 'N': 
                        if( j == 0){
                            System.out.print("*   *     "); 
                        }
                        else if(j == 1){
                            System.out.print("**  *     "); 
                        }
                        else if(j == 2){
                            System.out.print("**  *     "); 
                        }
                        else if(j == 3){
                            System.out.print("* * *     "); 
                        }
                        else if(j == 4){
                            System.out.print("*  **     ");
                        }
                        else if(j == 5){
                            System.out.print("*  **     "); 
                        }
                        else if(j == 6){
                            System.out.print("*   *     "); 
                        }
                        break;


                    case 'O': 
                        if( j == 0){
                            System.out.print(" ***      "); 
                        }
                        else if(j == 1){
                            System.out.print("*   *     "); 
                        }
                        else if(j == 2){
                            System.out.print("*   *     "); 
                        }
                        else if(j == 3){
                            System.out.print("*   *     "); 
                        }
                        else if(j == 4){
                            System.out.print("*   *     ");
                        }
                        else if(j == 5){
                            System.out.print("*   *     "); 
                        }
                        else if(j == 6){
                            System.out.print(" ***      "); 
                        } 
                        break; 

                    case 'P': 
                        if( j == 0){
                            System.out.print("*****     "); 
                        }
                        else if(j == 1){
                            System.out.print("*   *     "); 
                        }
                        else if(j == 2){
                            System.out.print("*   *     "); 
                        }
                        else if(j == 3){
                            System.out.print("***       "); 
                        }
                        else if(j == 4){
                            System.out.print("*         ");
                        }
                        else if(j == 5){
                            System.out.print("*         "); 
                        }
                        else if(j == 6){
                            System.out.print("*         "); 
                        } 
                        break;

                    case 'Q': 
                        if( j == 0){
                            System.out.print(" ***      "); 
                        }
                        else if(j == 1){
                            System.out.print("*   *     "); 
                        }
                        else if(j == 2){
                            System.out.print("*   *     "); 
                        }
                        else if(j == 3){
                            System.out.print("*   *     "); 
                        }
                        else if(j == 4){
                            System.out.print("* * *     ");
                        }
                        else if(j == 5){
                            System.out.print("*  **     "); 
                        }
                        else if(j == 6){
                            System.out.print(" *** **   "); 
                        } 
                        break;

                    case 'R': 
                        if( j == 0){
                            System.out.print("*****     "); 
                        }
                        else if(j == 1){
                            System.out.print("*   *     "); 
                        }
                        else if(j == 2){
                            System.out.print("*  *      "); 
                        }
                        else if(j == 3){
                            System.out.print("***       "); 
                        }
                        else if(j == 4){
                            System.out.print("*  *      ");
                        }
                        else if(j == 5){
                            System.out.print("*   *     "); 
                        }
                        else if(j == 6){
                            System.out.print("*   *     "); 
                        }
                        break;
                    
                    case 'S': 
                        if( j == 0){
                            System.out.print("*****     "); 
                        }
                        else if(j == 1){
                            System.out.print("*         "); 
                        }
                        else if(j == 2){
                            System.out.print("*         "); 
                        }
                        else if(j == 3){
                            System.out.print("*****     "); 
                        }
                        else if(j == 4){
                            System.out.print("    *     ");
                        }
                        else if(j == 5){
                            System.out.print("    *     "); 
                        }
                        else if(j == 6){
                            System.out.print("*****     "); 
                        }
                        break;
                        
                    case 'T': 
                        if( j == 0){
                            System.out.print("*****     "); 
                        }
                        else if(j == 1){
                            System.out.print("  *       "); 
                        }
                        else if(j == 2){
                            System.out.print("  *       "); 
                        }
                        else if(j == 3){
                            System.out.print("  *       "); 
                        }
                        else if(j == 4){
                            System.out.print("  *       ");
                        }
                        else if(j == 5){
                            System.out.print("  *       "); 
                        }
                        else if(j == 6){
                            System.out.print("  *       "); 
                        }
                        break;

                    case 'U': 
                        if( j == 0){
                            System.out.print("*   *     "); 
                        }
                        else if(j == 1){
                            System.out.print("*   *     "); 
                        }
                        else if(j == 2){
                            System.out.print("*   *     "); 
                        }
                        else if(j == 3){
                            System.out.print("*   *     "); 
                        }
                        else if(j == 4){
                            System.out.print("*   *     ");
                        }
                        else if(j == 5){
                            System.out.print("*   *     "); 
                        }
                        else if(j == 6){
                            System.out.print(" ***      "); 
                        }
                        break; 

                    case 'V': 
                        if( j == 0){
                            System.out.print("*   *     "); 
                        }
                        else if(j == 1){
                            System.out.print("*   *     "); 
                        }
                        else if(j == 2){
                            System.out.print("*   *     "); 
                        }
                        else if(j == 3){
                            System.out.print("*   *     "); 
                        }
                        else if(j == 4){
                            System.out.print("*   *     ");
                        }
                        else if(j == 5){
                            System.out.print(" * *      "); 
                        }
                        else if(j == 6){
                            System.out.print("  *       "); 
                        }
                        break; 

                    case 'W': 
                        if( j == 0){
                            System.out.print("*   *     "); 
                        }
                        else if(j == 1){
                            System.out.print("*   *     "); 
                        }
                        else if(j == 2){
                            System.out.print("*   *     "); 
                        }
                        else if(j == 3){
                            System.out.print("*   *     "); 
                        }
                        else if(j == 4){
                            System.out.print("* * *     ");
                        }
                        else if(j == 5){
                            System.out.print("** **     "); 
                        }
                        else if(j == 6){
                            System.out.print("*   *     "); 
                        }
                        break;

                    case 'X': 
                        if( j == 0){
                            System.out.print("*   *     "); 
                        }
                        else if(j == 1){
                            System.out.print("*   *     "); 
                        }
                        else if(j == 2){
                            System.out.print(" * *      "); 
                        }
                        else if(j == 3){
                            System.out.print("  *       "); 
                        }
                        else if(j == 4){
                            System.out.print(" * *      ");
                        }
                        else if(j == 5){
                            System.out.print("*   *     "); 
                        }
                        else if(j == 6){
                            System.out.print("*   *     "); 
                        }
                        break;

                    case 'Y': 
                        if( j == 0){
                            System.out.print("*   *     "); 
                        }
                        else if(j == 1){
                            System.out.print("*   *     "); 
                        }
                        else if(j == 2){
                            System.out.print(" * *      "); 
                        }
                        else if(j == 3){
                            System.out.print("  *       "); 
                        }
                        else if(j == 4){
                            System.out.print("  *       ");
                        }
                        else if(j == 5){
                            System.out.print("  *       "); 
                        }
                        else if(j == 6){
                            System.out.print("  *       "); 
                        }
                        break;
                    
                    case 'Z': 
                        if( j == 0){
                            System.out.print("*****     "); 
                        }
                        else if(j == 1){
                            System.out.print("    *     "); 
                        }
                        else if(j == 2){
                            System.out.print("   *      "); 
                        }
                        else if(j == 3){
                            System.out.print("  *       "); 
                        }
                        else if(j == 4){
                            System.out.print(" *        ");
                        }
                        else if(j == 5){
                            System.out.print("*         "); 
                        }
                        else if(j == 6){
                            System.out.print("*****     "); 
                        }
                        break;
                } 
            }//
            System.out.print("\n");    
        }
    }
}
