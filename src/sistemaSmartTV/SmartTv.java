package sistemaSmartTV;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }

    public void mudarCanal(int novoCanal){
        canal= novoCanal;
    }
    public void subirCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }
    public void aumentarVolume(){
        volume++;
    }

    public void dimuirVolume(){
        volume--;
    }
}
