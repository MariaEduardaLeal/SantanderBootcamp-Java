package escola;

public class Aluno {
    private String nome;
    private int idade;

    /*O método get é responsável por obter o valor atual do atributo
    logo ele precisa ser público, retornar um tipo correspondente
    * */
    public String getNome() {
        return nome;
    }

    /*
    O método set é responsável por definir ou modificar o valor de
    um atributo em um objeto, logo ele também presa ser public,
    receber um parâmetro do mesmo tipo da variável mas não retorna nenhum valor: void
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
