package intermediario.stream;

import java.util.*;
import java.util.stream.Collectors;

class ClienteTeste {
     String nome;
     Integer idade;

    public ClienteTeste(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome() + " Idade: " + this.getIdade();
    }
}

public class StreamCollect {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List<ClienteTeste> clienteTestes = Arrays.asList(new ClienteTeste("Isaque", 27), new ClienteTeste("Elias", 36), new ClienteTeste("Jessica", 23), new ClienteTeste("Selma", 40));

        System.out.println(clienteTestes);
//      Implementando o nosso proprio COLLECT
        Set<String> collect = list.stream()
                .collect(
                        HashSet::new, // FORNECEDOR (Função lambda que vai fornecer a instancia do objetivo que queremos usar para acumular o resultado.
                        (l, e) -> l.add(e.toString() + "R"), // ACUMULAÇÃO Como amarzena um resultado dentro da nova LISTA (primeiro recebe a propria lista que foi criada, depois um elemetro do STREAM).
                        (l1, l2) -> l1.addAll(l2) // COMBINAÇÃO (Existe varios COLLECT sendo executado ao mesmo tempo, essa função agrupa eles em um só).
                );
        System.out.println(list);// [1, 2, 3, 4, 5, 6]
        System.out.println(collect);// [2R, 1R, 6R, 5R, 4R, 3R]

//      Collect toList, irá amarzenar o resultado em uma lista
        List<Integer> collect2 = list.stream()
                .filter(numero -> numero % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(collect2);// [2, 4, 6]

//      JOINING, Serve para unir String
        String stringJoin = list.stream()
                .map(Objects::toString) // Convertendo os numeros da lista para String
                .collect(Collectors.joining("Isaque")); //Juntando as String
        System.out.println(stringJoin);// 1Isaque2Isaque3Isaque4Isaque5Isaque6

//      AVERAGING, Media
        Double averagingList = list.stream().collect(Collectors.averagingInt(v -> v));
        System.out.println("AVERAGING: " + averagingList);

//      SUMMING, Somar
        Integer collect1 = list.stream().collect(Collectors.summingInt(numero -> numero.intValue()));
        System.out.println("SUMMING:" + collect1);//      SUMMING, Somar

//      SUMMARIZING
        IntSummaryStatistics collect3 = list.stream().collect(Collectors.summarizingInt(numero -> numero.intValue()));
        System.out.println("SUM: " + collect3.getSum());
        System.out.println("MAX: " + collect3.getMax());
        System.out.println("MIN: " + collect3.getMin());
        System.out.println("COUNT: " + collect3.getCount());
        System.out.println("AVERAGE: " + collect3.getAverage());


//        GROUPINGBY, ele vai agrupar os elementros de acordo com a expressão lambda passada
        list.stream()
                .collect(Collectors.groupingBy((n) -> n % 3))
               .forEach((n,u) -> System.out.println("Resultado: " + n + " | Valores: " + u.toString()));

        clienteTestes.stream()
                .collect(Collectors.groupingBy((n) -> n.getIdade() < 30))
               .forEach((n,u) -> System.out.println(n + u.toString()));

//      PARTITIONINGBY (BOOLEAN), ele vai agrupar os elementros de acordo com a expressão lambda passada
        Map<Boolean, List<ClienteTeste>> collect4 = clienteTestes.stream()
                .collect(Collectors.partitioningBy((n) -> n.getIdade() < 30));
        System.out.println(collect4);

/*
          toMap, recebe dois argumento
          1. Como que ele vai encontrar a chave do valor
          2. Da onde que ele vai tirar o valor em sí.
 */
        Map<Integer, Integer> collect5 = list.stream()
                .collect(Collectors.toMap(a -> a, m -> m + 1));
        System.out.println(collect5);


    }
}

