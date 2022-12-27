package Module1.ex2;

public class Auto {

    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro = 0;
    static int cantidadCreados;

    int cantidadAsientos(Asiento[] asientos){
        this.asientos = asientos;

        return asientos.length;
    }

    static String verificarIntegridad(){

        return "0";
    }


    public static void main(String[] args){

        Auto auto1 = new Auto();
        cantidadCreados++;

        Asiento asiento1 = new Asiento();
        Asiento asiento2 = new Asiento();
        Asiento asiento3 = new Asiento();
        Asiento asiento4 = new Asiento();

        Asiento[] asientos = {asiento1,asiento2,asiento3,asiento4};
        String[] colores = {"rojo","verde","morado","negro"};


        for(int i = 0; i < asientos.length; i++){

            asientos[i].cambiarColor(colores[i]);

        }


        for(int i = 0; i < asientos.length; i++){
            System.out.println("Color de asiento # " + (i+1) + ": " + asientos[i].color);

        }

        System.out.println("\nNumero de asientos del auto: " + auto1.cantidadAsientos(asientos));
        System.out.println("Numero de autos: " + cantidadCreados);
        
    

    
    }


    
}
