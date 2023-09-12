package desafioDeCodigos.desafiosPOO.reunioesAcionistas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SistemaAcionistas {
    public List<String> obterAnalisesDesempenho(String dataInicialStr, String dataFinalStr) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date dataInicial = df.parse(dataInicialStr);
        Date dataFinal = df.parse(dataFinalStr);

        // Simula uma base de dados em uma lista de análises:
        List<Analise> analises = new ArrayList<>();
        analises.add(new Analise(df.parse("01/01/2023"), "Analise de Desempenho Financeiro"));
        analises.add(new Analise(df.parse("15/02/2023"), "Analise de Riscos e Exposicoes"));
        analises.add(new Analise(df.parse("31/03/2023"), "Analises Corporativas"));
        analises.add(new Analise(df.parse("01/04/2023"), "Analise de Politicas e Regulamentacoes"));
        analises.add(new Analise(df.parse("15/05/2023"), "Analise de Ativos"));
        analises.add(new Analise(df.parse("30/06/2023"), "Analise de Inovacao e Tecnologia"));

        // Lista para armazenar as descrições das análises dentro do período especificado
        List<String> analisesFiltradas = new ArrayList<>();

        // Itera sobre as análises e verifica se a data está dentro do intervalo
        for (Analise analise : analises) {
            Date dataAnalise = analise.getData();

            if (dataAnalise.compareTo(dataInicial) >= 0 && dataAnalise.compareTo(dataFinal) <= 0) {
                // Adiciona a descrição à lista de análises filtradas
                analisesFiltradas.add(analise.getDescricao());
            }
        }

        // Retorna a lista de descrições das análises filtradas
        return analisesFiltradas;
    }
}