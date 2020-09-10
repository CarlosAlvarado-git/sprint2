public class Productos {

    private String nombre;
    private int precio;
    private int cantidad;

    public Productos(String nom, int pre, int cant)
    {
        this.nombre = nom;
        this.precio = pre;
        this.cantidad = cant;
    }

    public String getNombre()
    {
        return this.nombre;
    }

    public int getPrecio()
    {
        return this.precio;
    }

    public int getCantidad()
    {
        return this.cantidad;
    }

    public void setNombre(String n)
    {
        this.nombre = n;
    }

    public void setPrecio(int p)
    {
        this.precio = p;
    }

    public void setCantidad(int c)
    {
        this.cantidad = c;
    }
}
