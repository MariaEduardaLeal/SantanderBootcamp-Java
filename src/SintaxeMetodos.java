public class SintaxeMetodos {
    public static void main(String[] args) {
        String nome1 = "Eduarda";
        String nome2 = "Leal";

        String nomeCompleto = nomeCompleto(nome1, nome2);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
