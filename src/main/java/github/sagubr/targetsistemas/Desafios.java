package github.sagubr.targetsistemas;

import java.util.HashMap;
import java.util.Map;

public class Desafios {

    public static void desafio1() {
        int indice = 13, soma = 0, k = 0;
        while (k < indice) {
            k = k + 1;
            soma = soma + k;
        }
        System.out.println("Resultado da soma: " + soma);
    }

    public static void desafio2(int numero) {
        int a = 0, b = 1, c = 0;
        while (c < numero) {
            c = a + b;
            a = b;
            b = c;
        }
        if (c == numero || numero == 0) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " NÃO pertence à sequência de Fibonacci.");
        }
    }

    public static void desafio4() {

        Map<String, Double> faturamentoPorEstado = new HashMap<>();
        faturamentoPorEstado.put("SP", 67836.43);
        faturamentoPorEstado.put("RJ", 36678.66);
        faturamentoPorEstado.put("MG", 29229.88);
        faturamentoPorEstado.put("ES", 27165.48);
        faturamentoPorEstado.put("Outros", 19849.53);

        double total = faturamentoPorEstado
                .values()
                .stream()
                .mapToDouble(Double::doubleValue).sum();

        for (Map.Entry<String, Double> entry : faturamentoPorEstado.entrySet()) {
            String estado = entry.getKey();
            double faturamento = entry.getValue();
            double percentual = (faturamento / total) * 100;
            System.out.printf("Percentual de %s: %.2f%%\n", estado, percentual);
        }
    }

    public static void desafio5(String input) {

        char[] invertida = new char[input.length()];

        for (int i = 0; i < input.length(); i++) {
            invertida[i] = input.charAt(input.length() - 1 - i);
        }
        System.out.println("String de entrada: " + input);
        System.out.println("String invertida: " + new String(invertida));
    }

}




