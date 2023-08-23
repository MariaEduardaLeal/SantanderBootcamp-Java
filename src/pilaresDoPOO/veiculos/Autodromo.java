package pilaresDoPOO.veiculos;

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        Moto vespa = new Moto();

        jeep.ligar();
        vespa.ligar();
        jeep.setPlaca("KFD-94942");
        vespa.setPlaca("SKD-98342");

        System.out.println("Placa do veículo " + jeep.getPlaca() );
        System.out.println("Placa do veículo " + vespa.getPlaca());
    }
}
