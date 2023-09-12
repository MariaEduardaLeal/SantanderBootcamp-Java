package desafioDeCodigos.desafiosPOO.cofresSeguros;

public class CofreDigital extends Cofre{
    private int senha;
    public CofreDigital(String tipo, String metodoAbertura, int senha) {
        super(tipo, metodoAbertura);
        this.senha = senha;
    }

    public boolean validarSenha(int confirmacaoSenha) {
        return confirmacaoSenha == this.senha;
    }
}
