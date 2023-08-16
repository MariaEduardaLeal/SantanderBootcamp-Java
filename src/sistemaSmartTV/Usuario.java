package sistemaSmartTV;

public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada ? " + smartTv.ligada);
        System.out.println("Canal Atual ?" + smartTv.canal);
        System.out.println("Volume atual ? " + smartTv.volume);

        smartTv.ligar();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.subirCanal();
        smartTv.mudarCanal(13);
        System.out.println("Novo Status -> TV ligada ?" + smartTv.ligada);
        System.out.println("Novo Status -> Volume atual ?" +smartTv.volume);
        System.out.println("Novo Status -> Canal atual ? " + smartTv.canal);

    }
}
