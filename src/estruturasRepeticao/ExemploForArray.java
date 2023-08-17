package estruturasRepeticao;

public class ExemploForArray {
    public static void main(String[] args) {
        //em arrays o indice sempre começa por zero
        String alunos[] = {"Felipe", "Jonas", "Julia", "Marcos"};

        for (int indice =0; indice < alunos.length; indice++){
            System.out.println("O aluno de indíce x= " + indice + " é " + alunos[indice]);
        }
    }
}
