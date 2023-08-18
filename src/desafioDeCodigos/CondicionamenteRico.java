package desafioDeCodigos;

import java.util.Scanner;

public class CondicionamenteRico {
    public static void main(String[] args) {
        CondicionamenteRico conta = new CondicionamenteRico();
        Scanner scanner = new Scanner(System.in);
        int saldoTotal = scanner.nextInt();
        int valorSaque = scanner.nextInt();

       String mensagemSaldo = conta.saque(saldoTotal, valorSaque);
       System.out.println(mensagemSaldo);
    }
    public String saque(int saldoDisponivel, int valorSaque){
        if (valorSaque > saldoDisponivel){
            return "Saldo insuficiente. Saque não realizado";
        }else{
            int novoSaldo = saldoDisponivel - valorSaque;
            return "Saque realizado com sucesso. Novo saldo: " + novoSaldo;
        }
    }
}
