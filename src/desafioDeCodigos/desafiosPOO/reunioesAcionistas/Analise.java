package desafioDeCodigos.desafiosPOO.reunioesAcionistas;


import java.util.Date;
class Analise {
    Date data;
    String descricao;

    public Analise(Date data, String descricao) {
        this.data = data;
        this.descricao = descricao;
    }

    public Date getData() {
        return data;
    }

    public String getDescricao() {
        return descricao;
    }
}