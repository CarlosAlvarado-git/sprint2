import java.util.Scanner;

public class ejercicio14 {

    public static void main(String[] args) {

        int num, x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese numero: ");
        num = sc.nextInt();
        long factorial = 1;

        for( x= 1; x <= num; ++x)
        {
           factorial *= x;
        }
        System.out.printf("Factorial de "+num+" es "+factorial+"");
    }
}