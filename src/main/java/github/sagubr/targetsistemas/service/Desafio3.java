package github.sagubr.targetsistemas.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import github.sagubr.targetsistemas.model.Faturamento;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Desafio3 {

    public static void main(String[] args) {

        try {
            ObjectMapper mapper = new ObjectMapper();
            List<Faturamento> faturamentoMensal = mapper.readValue(
                    new File("src/main/resources/faturamento.json"),
                    new TypeReference<>() {
                    });

            double menor = Double.MAX_VALUE;
            double maior = Double.MIN_VALUE;
            double soma = 0;
            int diasComFaturamento = 0;

            for (Faturamento f : faturamentoMensal) {
                if (f.getValor() > 0) {
                    if (f.getValor() < menor) {
                        menor = f.getValor();
                    }
                    if (f.getValor() > maior) {
                        maior = f.getValor();
                    }
                    soma += f.getValor();
                    diasComFaturamento++;
                }
            }

            double media = soma / diasComFaturamento;

            int diasAcimaDaMedia = 0;
            for (Faturamento f : faturamentoMensal) {
                if (f.getValor() > media) {
                    diasAcimaDaMedia++;
                }
            }

            System.out.printf("Menor faturamento: R$ %.2f\n", menor);
            System.out.printf("Maior faturamento: R$ %.2f\n", maior);
            System.out.println("Dias com faturamento acima da média: " + diasAcimaDaMedia);

        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo JSON: " + e.getMessage());
        }
    }
}
