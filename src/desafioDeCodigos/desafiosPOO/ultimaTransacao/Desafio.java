package desafioDeCodigos.desafiosPOO.ultimaTransacao;
import java.util.Scanner;
public class Desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Solicite ao usuário que forneça os valores necessários para criar uma transação

        String entrada = scanner.nextLine();

        String[] partes = entrada.split(",");

        if (partes.length == 4 ){
            String data = partes[0].trim(); //O método trim() é usado para remover espaços em branco no início e no final de uma string
            String hora = partes[1].trim();
            String descricao = partes[2].trim();
            double valor = Double.parseDouble(partes[3].trim());

            Transacao novaTransacao = new Transacao(data, hora, descricao, valor);

            novaTransacao.imprimir();
        }else{
            System.out.println("Valor inválido!");
        }


    }
}
