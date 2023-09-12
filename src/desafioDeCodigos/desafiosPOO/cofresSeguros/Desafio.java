package desafioDeCodigos.desafiosPOO.cofresSeguros;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tipoCofre = scanner.nextLine();

        // TODO: Implemente a condição necessário para a verificação dos cofres seguros:
        if (tipoCofre.equalsIgnoreCase("digital")) {
            String metodoDeAbertura = "Senha";
            System.out.println("Digite a senha: ");
            int senha = scanner.nextInt();

            CofreDigital novoCofre = new CofreDigital("Cofre Digital", metodoDeAbertura, senha);

            System.out.println("Confirme a senha:");
            int confSenha = scanner.nextInt();

            // Valida a senha
            boolean senhaValida = novoCofre.validarSenha(confSenha);

            if (senhaValida){
                novoCofre.imprimirInformacoes();
                System.out.println("Cofre aberto!");
            }else{
                novoCofre.imprimirInformacoes();
                System.out.println("Senha incorreta!");
            }

        }else if(tipoCofre.equalsIgnoreCase("fisico")){
            CofreFisico novoCofre = new CofreFisico("Cofre Fisico", "Chave");
            novoCofre.imprimirInformacoes();
        }
    }
}
