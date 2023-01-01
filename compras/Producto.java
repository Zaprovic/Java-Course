package compras;

@SuppressWarnings("unused")
public class Producto {

    private int codigo;
    protected String nombre;
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
