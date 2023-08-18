package desafioDeCodigos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BancoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");
        BancoApp juros = new BancoApp();

        double valorInicial = scanner.nextDouble();
        double taxaJuros = scanner.nextDouble();
        int periodo = scanner.nextInt();


        double valorFinal = juros.jurosCompostos(valorInicial, taxaJuros, periodo);

        System.out.println("Valor final do investimento: R$ " + df.format(valorFinal));
    }
    public double jurosCompostos(double valorInicial, double taxasJuros, int periodo){
        double montante = valorInicial * Math.pow(1 + taxasJuros, periodo);
        //O Math.pow serve para fazermos a elevação de (1 + taxaJuros) ^ periodo
        return montante;
    }
}
