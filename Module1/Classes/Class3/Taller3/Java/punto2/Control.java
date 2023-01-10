
@SuppressWarnings("unused")
public class Control {

    public TV tv;
    public int canal;

    public void turnOn(){
        tv.turnOn();
    }

    public void turnOff(){
        tv.turnOff();
    }

    public void canalUp(){
        tv.canalUp();
    }

    public void canalDown(){
        tv.canalDown();
    }

    public void volumenUp(){
        tv.volumenUp();
    }

    public void volumenDown(){
        tv.volumenDown();
    }

    public void setCanal(int canal){

        if(canal < 120 && canal > 1){
            tv.setCanal(canal);

        }
    }

    public void enlazar(TV tv){
        this.tv = tv;
        tv.setControl(this);
    }

    public void setTV(TV tv){
        this.tv = tv;
    }

    public TV getTV(){
        return this.tv;
    }

}
