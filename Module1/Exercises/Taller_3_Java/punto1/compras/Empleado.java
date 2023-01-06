package Module1.Exercises.Taller_3_Java.punto1.compras;

public class Empleado {
    public long cedula;
    public String nombre;
    public String cargo;

    public Empleado(long cedula, String nombre, String cargo){
        this.cedula = cedula;
        this.nombre = nombre;
        this.cargo = cargo;
    }

    public boolean tengoPermiso(){
        return cargo.contains("Administrador");
    }

    
}
