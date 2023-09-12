package desafioDeCodigos.desafiosPOO.herancaBancaria;

import java.text.DecimalFormat;

public class ContaBancaria {
    int numeroConta;
    String titular;
    double saldo;

    public ContaBancaria(int numero, String titular, double saldo) {
        this.numeroConta = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void exibirInformacoes() {
        System.out.println("Informações: " +
                "\nConta: " + numeroConta +
                "\nTitular: " + titular +
                "\nSaldo: R$" + saldo);
    }
}
