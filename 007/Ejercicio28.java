public class Ejercicio28 {

    public static void main(String[] args)
    {
        int lanzamiento1 = tirar();
        int lanzamiento2 = tirar();
        int lanzamiento3 = tirar();
        int suma = lanzamiento1+ lanzamiento2+ lanzamiento3;
        System.out.println("Bienvenido al programa que lanza el dado 3 veces\n");  
        System.out.println("Primer lanazamiento: " + lanzamiento1); 
        System.out.println("Segundo lanazamiento: " + lanzamiento2); 
        System.out.println("Tercer lanazamiento: " + lanzamiento3);
        System.out.print("Total: " + suma);
    }

    public static int tirar()
    {
        return ((int)(Math.random()*6 + 1));
    }
    
}