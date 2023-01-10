
public class Main {

    public static void main(String[] args){

        Animal animal1 = new Animal();
        Animal.totalAnimales++;

        Animal animal2 = new Animal();
        Animal.totalAnimales++;

        animal1.nombre = "Cebra";
        animal1.genero = "F";

        animal2.nombre = "Caballo";
        animal2.peso = 98.2;

        System.out.println(animal1.nombre + " se va a casar con "
        + animal2.nombre);

        animal1.setPareja(animal2);
        animal2.setPareja(animal1);

        Familia familia = animal1.procrear("Cebrallo");

        if(familia != null){
            familia.imprimir();
            System.out.println(familia.hijo);

        }

        else{
            System.out.println("No se pudo formar familia");
        }

        System.out.println("Total de animales: " + Animal.totalAnimales);

        Animal.morir(animal2);

        System.out.println("Nuevo total de animales: " + Animal.totalAnimales);


    }
    
}


class Animal{

    String nombre;
    String genero = "M";
    double peso;
    Animal pareja;
    static int totalAnimales;

    void setPareja(Animal pareja){
        this.pareja = pareja;

    }

    Animal tenerHijo(String nombre){
        Animal hijo = new Animal();
        totalAnimales++;
        hijo.nombre = nombre;
        hijo.peso = 1;
        double random = Math.random();

        if(random < 0.5){
            hijo.genero = "F";

        }

        else{
            hijo.genero = "M";
        }

        return hijo;

    }

    Familia procrear(String nombreHijo){

        if(pareja == null){
            System.out.println(nombre + " no tiene pareja");
            return null;

        }

        if(pareja.genero.equals(genero)){
            System.out.println(nombre + " y " + pareja.nombre + " son del mismo genero");
            return null;
        }

        System.out.println(nombre + " y " + pareja.nombre + " van a tener un hijo");

        Familia f = new Familia();

        if (genero.equals("M")){
            f.mama = pareja;
            f.papa = this;

        }

        else{
            f.mama = this;
            f.papa = pareja;
        }

        Animal hijo = f.mama.tenerHijo(nombreHijo);
        f.hijo = hijo;

        System.out.println(hijo.nombre + " ha llegado al mundo");
        return f;
    }

    static void morir(Animal animal){
        System.out.println(animal.nombre + " ha muerto");
        totalAnimales--;

    }

    public String toString(){
        return "Me llamo " + nombre + " y peso " + peso;
    }
}


class Familia {

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



