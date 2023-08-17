package estruturaCondicional;

import java.util.Scanner;

public class ResultadoEscolar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Digite as 3 notas do aluno");
        double nota1 = scan.nextDouble();
        double nota2 = scan.nextDouble();
        double nota3 = scan.nextDouble();

        ResultadoEscolar resultado = new ResultadoEscolar();

        String resultadoFinal = resultado.media(nota1, nota2, nota3);
        System.out.println(resultadoFinal);
    }

    public String media(double nota1, double nota2, double nota3) {
        double calcularMedia = (nota1 + nota2 + nota3) / 3;
        if (calcularMedia >= 7){
            return "O aluno passou de ano" +
                    "\nA média final é " + calcularMedia;
        }else{
            return "O aluno não passou de ano" +
                    "\n A média final é " + calcularMedia;
        }

    }

}
