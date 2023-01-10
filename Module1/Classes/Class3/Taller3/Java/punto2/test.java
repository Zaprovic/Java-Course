

@SuppressWarnings("unused")
public class test {

    public static void main(String[] args) {

        Control control1 = new Control();
        Marca marca1 = new Marca("LG");
        TV tv1 = new TV(marca1, false);

        //Primero hay que asignarle a control1 un televisor, para evitar la excepcion 'NullPointerException'. Esto se debe a que logicamente el primer metodo que se va a llamar es el de prender la tv, a.k.a el metodo turnOn() del control, pero este requiere de un argumento de tipo TV y si no se le asigna, se estaria llamando a un metodo con un objeto null, lo que arrojaria esa excepcion
        control1.tv = tv1;

        //Prendo el televisor: Al prender el control automaticamente prendo el televisor tambien
        control1.turnOn();

        //Miro en que canal estoy y cuanto volumen tiene el televisor una vez esta prendido
        System.out.println("El televisor se prendio");
        System.out.println("Volumen: " + tv1.getVolumen());
        System.out.println("Canal: " + tv1.getCanal());

        System.out.println();

        //Cambio el canal
        System.out.println("Cambio el canal y volumen");
        control1.setCanal(100);
        control1.volumenUp();
        control1.volumenUp();
        
        System.out.println("Canal: " +  tv1.getCanal());
        System.out.println("Volumen: " + tv1.getVolumen());

        control1.setCanal(118);

        System.out.println();

        //Disminuyo el canal
        control1.canalUp();
        

        System.out.println("Canal: " +  tv1.getCanal());
        System.out.println("Volumen: " + tv1.getVolumen());

    

       
     


        
    }
    
}
