package Module1.ex2.Java;

public class Motor {

    int numeroCilindros;
    String tipo;
    int registro = 0;

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

    public static void main(String[] args){

    }
    
}
