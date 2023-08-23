package pilaresDoPOO.veiculos;

public class Carro extends Veiculo{
    //O extends é para usarmos os métodos da classe veículo - HERANÇA
    public void ligar(){
        //Emcapsulando
        confereCambio();
        confereCombustivel();
        System.out.println("Carro ligado");
    }
    public void confereCombustivel(){
        System.out.println("conferindo combustivel");
    }
    public void confereCambio(){
        System.out.println("conferindo câmbio em P");
    }
}
