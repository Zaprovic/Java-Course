public class Familia {

    Animal papa;
    Animal mama;
    Animal hijo;

    String genero;

    void imprimir(){
        
        if(hijo.genero.equals("M")){
            genero = "Masculino";

        }

        else{
            genero = "Femenino";
        }

        System.out.println("Papa: " + papa.nombre + "\n"
        + "Mama: " + mama.nombre + "\n" + 
        "Hijo: " + hijo.nombre);
    }
    
}
