package Module1.Exercises.Taller3.Java.punto1.compras;
public class Producto {
    private int codigo;
    private String nombre;
    protected String tipo;
    protected static int totalProductosPedidos;

    public Producto(int codigo, String nombre, String tipo){
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    protected void imprimirNombre(){
        System.out.print(nombre);
    }

    public int getCodigo(){
        return codigo;
    }

    public static int getTotalProductosPedidos(){
        return totalProductosPedidos;

    }

    
}
