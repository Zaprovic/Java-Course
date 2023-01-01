package gestionHumana;

@SuppressWarnings("unused")
public class Empleado {

    public long cedula;
    private String nombre;
    private String cargo;

    public Empleado(long cedula, String nombre, String cargo){
        this.cedula = cedula;
        this.nombre = nombre;
        this.cargo = cargo;
    }

    public boolean tengoPermiso(){
        return cargo.contains("Administrador");
    }

}
