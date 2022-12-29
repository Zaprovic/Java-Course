package Module1.Exercises.Taller1_Java;

public class Main {

    public static void main(String[] args){

        //Asientos
        
        Asiento asiento1 = new Asiento();
        Asiento asiento2 = new Asiento();
        Asiento asiento3 = new Asiento();
        Asiento asiento4 = new Asiento();

        asiento1.cambiarColor("amarillo");
        asiento2.cambiarColor("verde");
        asiento3.cambiarColor("rojo");
        asiento4.cambiarColor("negro");

        Asiento[] asientosLista = {asiento1,asiento2,
                                    asiento3,asiento4};

    }

}

class Asiento{

    String color;
    int precio;
    int registro;

    void cambiarColor(String color){

        if(this.color == "verde" || this.color == "rojo" || this.color == "amarillo" || 
        this.color == "negro" || this.color == "blanco"){

            this.color = color;

        }

        else{
            return;
        }
        


    }

}


class Auto{
    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    static int cantidadCreados = 0;

    int cantidadAsientos(){
        return this.asientos.length;
    }

    String verificarIntegridad(){
        
        if(this.registro == this.motor.registro){
            return "Auto original";
        }

        else{
            return "Las piezas no son originales";
        }
    }

}

class Motor{
    int numeroCilindros;
    String tipo;
    int registro;

    void cambiarRegistro(int registro){
        this.registro = registro;
    }

    void asignarTipo(String tipo){

        if(tipo.equals("gasolina") || tipo.equals("electrico")){
            this.tipo = tipo;
        }

        else{
            return;
        }
    }

}
