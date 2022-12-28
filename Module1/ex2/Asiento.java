package Module1.ex2;

public class Asiento {

    String color = "Default";
    int precio;
    int registro = 0;

    void cambiarColor(String color){

        if(color.equals("rojo") || color.equals("verde") || color.equals("amarillo") || color.equals("negro") || 
        color.equals("blanco") ){

            this.color = color;
            
        }

        else{
            return;
        }

    }



    public static void main(String[] args){

        System.out.println("Hello world");

    }
    

    
}
