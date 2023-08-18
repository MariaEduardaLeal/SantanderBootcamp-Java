package desafioDeCodigos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class EquilibrandoSaldo {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       EquilibrandoSaldo conta = new EquilibrandoSaldo();


        double saldoAtual = scanner.nextDouble();
        double valorDeposito = scanner.nextDouble();
        double valorRetirada = scanner.nextDouble();

        //TODO: Calcular o saldo atualizado de acordo com a descrição deste desafio.
        double novoSaldo = conta.deposito(saldoAtual, valorDeposito);
        double saldoFinal = conta.retirada(novoSaldo, valorRetirada);
        //TODO: Imprimir o a saída de conforme a tabela de exemplos (uma casa decimal).
        DecimalFormat formatar = new DecimalFormat("#0.0");
        String saldoFormatado = formatar.format(saldoFinal);

        System.out.println("Saldo atualizado na conta: " + saldoFormatado);
    }
    public double deposito(double saldoAtual, double valorDeposito){
        double novoSaldo = saldoAtual + valorDeposito;
        return novoSaldo;
    }
    public double retirada(double novoSaldo, double valorRetirada) {
        double saldoFinal = novoSaldo - valorRetirada;
        return saldoFinal;
    }

}
