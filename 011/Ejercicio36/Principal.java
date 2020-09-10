import java.util.Scanner;
import java.util.LinkedList;
public class Principal {
    public static Scanner reader = new Scanner(System.in);
    public static LinkedList<Productos> producto = new LinkedList<Productos>();
    public static LinkedList<Productos> ventas = new LinkedList<Productos>();
    public static LinkedList<Integer> nventas = new LinkedList<Integer>();
    public static Productos p;
    public static Productos v;
    public static String nombre = "";
    public static int precio = 0;
    public static int cantidad = 0;
    public static int opcion = 0;
    public static int registro = 0;

    public static void inventario()
    {
        System.out.print("\n 1 = Agregar productos \n 2 = Modificar productos \n\n Ingrese una opcion: ");
        opcion = reader.nextInt();
        reader.nextLine();
        if(opcion == 1)
        {
            System.out.print("Ingrese el nombre del producto: ");
            nombre = reader.nextLine();
            System.out.print("Ingrese el precio del producto: ");
            precio = reader.nextInt();
            System.out.print("Ingrese la cantidad del producto: ");
            cantidad = reader.nextInt();
            reader.nextLine();
            p = new Productos(nombre, precio, cantidad);
            producto.add(p);
            System.out.println("Producto agregado!");
        }
        else if(opcion == 2){
            System.out.println("Listado de productos: ");
            for(int i=0; i<producto.size(); i++)
            {
                p = producto.get(i);
                System.out.println((i+1) + ": "+p.getNombre());
            }
            System.out.println("Ingrese el numero del producto que desea modificar: ");
            opcion = reader.nextInt();
            p = producto.get(opcion-1);
            System.out.println("Ingrese la nueva cantidad del producto: ");
            opcion = reader.nextInt();
            p.setCantidad(opcion);
            System.out.println("Producto modificado!");
        }
        else
        {
            System.out.println("Opcion " + opcion + " no existe");
        }
    }

    public static void venta()
    {
        opcion = 1;
        while(opcion != 2)
        {
            System.out.println("Listado de productos: ");
            for(int i=0; i<producto.size(); i++)
            {
                p = producto.get(i);
                System.out.println((i+1) + ": "+p.getNombre());
            }
            System.out.println("Ingrese el numero del producto que desea vender: ");
            opcion = reader.nextInt();
            p = producto.get(opcion-1);
            System.out.println("Ingrese la cantidad que desdea vender: ");
            opcion = reader.nextInt();
            int saldo = p.getCantidad() - opcion;
            if(saldo >= 0)
            {
                p.setCantidad(saldo);
                v = new Productos(p.getNombre(), p.getPrecio(), opcion);
                ventas.add(v);
            }
            else{
                System.out.print("No se puede realizar la venta");
            }
            System.out.print("\n 1 = Desea vender algo mas? \n 2 = Terminar la venta \n\n Ingrese una opcion: ");
            opcion = reader.nextInt();
            if(opcion == 2)
            {
                int total = 0;
                System.out.println("Producto        Cantidad        P.Unitario       Total");
                for(int i=registro; i<ventas.size(); i++)
                {
                    v = ventas.get(i);  
                    System.out.printf("%-20s  %-10d  Q%-12d  Q%d\n", v.getNombre(), v.getCantidad(), v.getPrecio(), (v.getPrecio()*v.getCantidad()));
                    total += (v.getPrecio() * v.getCantidad());
                }
                System.out.println("Gran Total: Q" + total);
                registro = ventas.size();
                if(total != 0)
                {
                    nventas.add(total);
                }
            }
        }
    }

    public static void resumentotal()
    {
        System.out.println("Producto        Cantidad        P.Unitario       Total");
        for(int i=0; i<ventas.size(); i++)
        {
            v = ventas.get(i);  
            System.out.printf("%-20s  %-10d  Q%-12d  Q%d\n", v.getNombre(), v.getCantidad(), v.getPrecio(), (v.getPrecio()*v.getCantidad()));
        }
    }

    public static void resumen()
    {
        for(int i=0; i<nventas.size(); i++)
        {
            System.out.println("Venta"+(i+1) + "    Total de: Q" + nventas.get(i));
        }
    }

    public static void main(final String[] args) {
        
        while(opcion != 4)
        {
            System.out.print("\n 1 = Inventario \n 2 = Venta de productos \n 3 = Resumen de ventas \n 4 = Resumen total de ventas \n 5 = Salir \n\n Ingrese una opcion: ");
            opcion = reader.nextInt();
            if(opcion == 1)
            {
                inventario();
            }
            else if(opcion == 2)
            {
                venta();
            }
            else if(opcion == 3)
            {
                resumen();
            }
            else if(opcion ==4)
            {
                resumentotal();
            }
            else if(opcion == 5)
            {
                opcion = 4;
            }
            else
            {
                System.out.println("Opcion " + opcion + " no existe");
            }
        }
     }
}
