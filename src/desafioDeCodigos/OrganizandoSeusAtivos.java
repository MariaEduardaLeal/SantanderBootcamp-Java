package desafioDeCodigos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class OrganizandoSeusAtivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList < String > ativos = new ArrayList < > ();

        //Entrada dos tipos de ativos
        int quantidadeAtivos = scanner.nextInt();
        scanner.nextLine();
        // Entrada dos códigos dos ativos
        for (int i = 0; i < quantidadeAtivos; i++) {
            String codigoAtivo = scanner.nextLine();
            ativos.add(codigoAtivo);
        }
        Collections.sort(ativos);
        // Imprimir ativos um por linha
        for (int i = 0; i < ativos.size(); i++) {
            String ativo = ativos.get(i);
            System.out.println(ativo);
        }
    }
}
