package extruturasDeExcecao;

import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {
    public static void main(String[] args) {
//        Number valor = Double.valueOf("a1.75");//valueOf tem a finalidade de pegar uma String e transformar em um double
        Number valor = null;
        try {
            valor = NumberFormat.getInstance().parse("a1.75");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        System.out.println(valor);
    }
}
