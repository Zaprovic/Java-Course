package Module1.ex2;

public class Auto {

    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro = 0;
    static int cantidadCreados;

    int cantidadAsientos(){
        return asientos.length;
    }

    String verificarIntegridad(){

        Auto auto = new Auto();
        
        if(motor.registro == auto.registro){
            return "Auto original";

        }

        else{
            return "Las piezas no son originales";
        }
        
    }


    public static void main(String[] args){

        Auto auto1 = new Auto();
        
        cantidadCreados++;

        System.out.println("Hay " + cantidadCreados + " autos en total");

        //Auto 1
        String marca1 = auto1.marca = "Mercedes Benz";
        int precio1 = auto1.precio = 10000;
        String modelo1 = auto1.modelo = "GLA 200";

        System.out.println("\nAuto 1" + 
        "\nModelo: " + modelo1 + 
        "\nPrecio: " + precio1 + 
        "\nMarca: " + marca1);

        System.out.println(auto1.verificarIntegridad());
    }
}
