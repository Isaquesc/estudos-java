package intermediario.collections.alura;

import java.util.HashMap;
import java.util.Map;

public class ChaveValores {

    public static void main(String[] args) {

        Map<String, Integer> nomesParaIdade = new HashMap<>();

        nomesParaIdade.put("Paulo", 31);
        nomesParaIdade.put("Adriano", 25);
        nomesParaIdade.put("Alberto", 33);
        nomesParaIdade.put("Guilherme", 26);


        for (String c : nomesParaIdade.keySet()) {
            System.out.println(c);
        }

        for (Integer cc : nomesParaIdade.values()) {
            System.out.println(cc);
        }


//        Set<Map.Entry<String, Integer>> associacoes = nomesParaIdade.entrySet();
//        for (Map.Entry<String, Integer> associacao : associacoes) {
//            System.out.println(associacao.getKey() + " - " + associacao.getValue());
//        }
//    }

    }
}
