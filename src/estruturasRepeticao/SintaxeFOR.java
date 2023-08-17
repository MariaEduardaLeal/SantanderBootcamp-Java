package estruturasRepeticao;

public class SintaxeFOR {
    public static void main(String[] args) {
        //estrutura do controle de fluxo for

    /*
    for (bloco de inicialização; expressão booleana de validação; bloco de atualização){
        comando que será executado até que a expressão
        de validação torne-se falsa
    }
     */

        //Exemplo carneirinhos
        for (int carneirinhos = 1; carneirinhos <= 20; carneirinhos++){
            System.out.println("Contando carneirinhos " +
                    carneirinhos + " carneirinhos");
        }
    }
}
