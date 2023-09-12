package desafioDeCodigos.desafiosPOO.abrindoContas;

import java.util.Scanner;

public class AbrindoConta {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Coloque o número da conta: ");
        int numeroConta = scan.nextInt();
        scan.nextLine(); // Consumir a quebra de linha

        System.out.println("Insira o nome do titular: ");
        String nomeTitular = scan.nextLine();

        System.out.println("Insira seu saldo: ");
        double saldo = scan.nextDouble();

        ContaBancaria novaConta = new ContaBancaria(numeroConta, nomeTitular, saldo);
        novaConta.mostrarInformacoes();


    }
}
