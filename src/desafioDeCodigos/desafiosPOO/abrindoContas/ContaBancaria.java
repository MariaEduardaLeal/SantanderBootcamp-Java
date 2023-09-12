package desafioDeCodigos.desafiosPOO.abrindoContas;

public class ContaBancaria {
    int numeroConta;
    String titular;

    double saldo;



    // Construtor da classe ContaBancaria
    public ContaBancaria(int numero, String titular, double saldo) {
        this.numeroConta = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    // Método para exibir informações da conta
    public void mostrarInformacoes() {
        System.out.println("Informações: " +
                "\nConta: " + numeroConta +
                "\nTitular: " + titular +
                "\nSaldo: R$" + saldo);
    }

}
