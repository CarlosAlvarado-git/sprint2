import java.util.Scanner;
public class ejercicio7 {
    
    public static void main(String[] args) {
        
        int num1, num2, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese numero: ");
        num1 = sc.nextInt();
        
        System.out.println("Ingrese numero ");
        num2 = sc.nextInt();
        
        sc.close();
        sum = num1 + num2;
        System.out.println("La suma de los dos numeros es: "+sum);
    }
}

