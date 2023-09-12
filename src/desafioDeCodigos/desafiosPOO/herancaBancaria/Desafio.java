package desafioDeCodigos.desafiosPOO.herancaBancaria;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Coloque o número da conta: ");
        int numeroConta = scan.nextInt();
        scan.nextLine(); // Consumir a quebra de linha

        System.out.println("Insira o nome do titular: ");
        String nomeTitular = scan.nextLine();

        System.out.println("Insira seu saldo: ");
        double saldo = scan.nextDouble();

        System.out.println("Insira a taxa de juros:");
        double taxaJuros = scan.nextDouble();

        ContaPoupanca contaPoupanca = new ContaPoupanca(numeroConta, nomeTitular, saldo, taxaJuros);

        System.out.println("Conta Poupanca:");
        contaPoupanca.exibirInformacoes();
    }
}
