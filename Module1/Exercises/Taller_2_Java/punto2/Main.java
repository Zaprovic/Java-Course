package Module1.Exercises.Taller_2_Java.punto2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("unused")
public class Main {
    public static void main(String[] args) {

        //Asientos
        Asiento asiento1 = new Asiento(2500,151);
        Asiento asiento2 = new Asiento(3500,151);
        Asiento asiento3 = new Asiento(4000, 151);
        Asiento asiento4 = new Asiento(3500,151);

        asiento1.cambiarColor("verde");
        asiento2.cambiarColor("rojo");
        asiento3.cambiarColor("azul");
        asiento4.cambiarColor("amarillo");


        Asiento[] asientos = {asiento1,asiento2,asiento3,asiento4};

        //Motor
        Motor motor = new Motor(6,"electrico",151);
        motor.asignarTipo("gas");

        //Auto
        Auto auto = new Auto("Cx-5",20000,asientos,"Mazda",motor,151);
        //auto.carInfo();

        System.out.println("\nTotal de autos: " + Auto.cantidadCreados);


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

        if (color.equals("verde") || color.equals("rojo") || color.equals("amarillo") || color.equals("negro") || color.equals("blanco")){
            this.color = color;

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
    static int cantidadCreados;

    Auto(String modelo, int precio, Asiento[] asientos, String marca, Motor motor, int registro){
        this.modelo = modelo;
        this.precio = precio;
        this.asientos = asientos;
        this.marca = marca;
        this.motor = motor;
        this.registro = registro;
        cantidadCreados++;

    }

    int cantidadAsientos(){
        return asientos.length;

    }

    String verificarIntegridad(){

        ArrayList<Integer> asientosRegistro = new ArrayList<>();

        for(Asiento i : this.asientos){
            asientosRegistro.add(i.registro);

        }


        Set<Integer> asientosSet = new HashSet<>(asientosRegistro);

        if(asientosSet.size() == 1){

            if(this.registro == this.motor.registro){
                return "Auto original";

            }

            else{
                return "Las piezas no son originales";
            }

        }

        else{
            return "Las piezas no son originales";
        }

    }


    void carInfo(){

        System.out.println("Modelo: " + modelo);
        System.out.println("Precio: " + precio);
        System.out.println("Asientos: " + Arrays.toString(asientos) + " (" + this.cantidadAsientos() + " cantidad de asientos)");
        System.out.println("Marca: " + marca);
        System.out.println("Motor: " + motor + " (Cilindros: " + motor.numeroCilindros + ", Tipo: " + motor.tipo + ", Registro: " + motor.registro + ")");
        System.out.println("Registro: " + registro);
        System.out.println("Legitimidad: " + this.verificarIntegridad());

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

    }





}