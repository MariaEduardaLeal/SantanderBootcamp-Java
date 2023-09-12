package desafioDeCodigos.desafiosPOO.herancaBancaria;

public class ContaPoupanca extends ContaBancaria{
    private double taxaJuros;

    public ContaPoupanca(int numero, String titular, double saldo, double taxaJuros) {
        super(numero, titular, saldo); // Chamada ao construtor da classe base (ContaBancaria)
        this.taxaJuros = taxaJuros; // Configura a taxa de juros específica da ContaPoupanca
    }
    @Override //um método na classe derivada (subclasse) está substituindo (sobrescrevendo) um método na classe base (superclasse).
    public void exibirInformacoes() {
        super.exibirInformacoes();// Chama o método da classe base para exibir informações comuns
        System.out.println("Taxa de juros: " + taxaJuros + "%");
    }
}
