package Module1.Exercises.Taller1_Java;

public class Main {

    public static void main(String[] args){

        //Asientos
        Asiento asiento1 = new Asiento(250,12);
        Asiento asiento2 = new Asiento(350,12);
        Asiento asiento3 = new Asiento(150,12);
        Asiento asiento4 = new Asiento(550,12);

        asiento1.cambiarColor("amarillo");
        asiento2.cambiarColor("verde");
        asiento3.cambiarColor("rojo");
        asiento4.cambiarColor("negro");

        Asiento[] asientosLista = {asiento1,asiento2,
                                    asiento3,asiento4};

        

        //Motor
        Motor motor1 = new Motor(6,"gasolina",12);
        motor1.asignarTipo("electrico");


        //Auto
        Auto auto1 = new Auto("XC60",75000,asientosLista,
        "Volvo",motor1,12);

        Auto.cantidadCreados++;


    }

}

class Asiento{

    String color;
    int precio;
    int registro;

    Asiento(int precio, int registro){
        this.precio = precio;
        this.registro = registro;
        
    }

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

    Auto(String modelo, int precio, Asiento[] asientos,
    String marca, Motor motor, int registro){
        this.modelo = modelo;
        this.precio = precio;
        this.asientos = asientos;
        this.marca = marca;
        this.motor = motor;
        this.registro = registro;


    }

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

    Motor(int numeroCilindros, String tipo, int registro){
        this.numeroCilindros = numeroCilindros;
        this.tipo = tipo;
        this.registro = registro;

    }

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
