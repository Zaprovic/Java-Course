
@SuppressWarnings("unused")
public class TV {

    private Marca marca;
    private int canal = 1;
    private int precio = 500;
    private boolean estado;
    private int volumen = 1;
    private Control control;
    private static int numTV;

    public TV(Marca marca, boolean estado){

        this.marca = marca;
        this.estado = false;
        numTV++;
    }

    private void setMarca(Marca marca){
        this.marca = marca;

    }

    private Marca getMarca(){
        return this.marca;
    }

    void setControl(Control control){
        this.control = control;
    }

    private Control getControl(){
        return this.control;
    }

    private void setPrecio(int precio){
        this.precio = precio;
    }

    private int getPrecio(){
        return this.precio;
    }

    private void setVolumen(int volumen){

        if(estado && this.volumen <= 7 && this.volumen >= 0){
            this.volumen = volumen;
        }
    }

    int getVolumen(){
        return volumen;
    }

    void setCanal(int canal){

        if(estado && this.canal >= 1 && this.canal <= 120){
            this.canal = canal;
        }
    }

    int getCanal(){
        return this.canal;
    }

    private static int getNumTV(){
        return numTV;
    }

    void turnOff(){
        this.estado = false;
    }

    public void turnOn(){
        this.estado = true;

    }

    private boolean getEstado(){
        return this.estado;
    }

    void canalUp(){

        if(estado && this.canal < 120){
            this.canal++;
        }
    }

    void canalDown(){

        if(estado && this.canal > 1){
            this.canal--;
        }
    }

    void volumenUp(){

        if(estado && this.volumen > 0 && this.volumen < 7){
            this.volumen++;
        }

    
      
    }

    void volumenDown(){

        if(estado && this.volumen < 7 && this.volumen > 0){
            this.volumen--;
        }
    }
    
}
