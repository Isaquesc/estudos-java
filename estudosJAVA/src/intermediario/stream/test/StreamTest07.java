package intermediario.stream.test;

import intermediario.stream.dominio.LightNovel;
import intermediario.stream.dominio.LightNovelListBuilder;

import java.util.Comparator;
import java.util.List;

public class StreamTest07 {
    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 4, 5, 6);

//        === SOMA
        Integer reduceSoma = list.stream()
                .reduce(0, Integer::sum);
        System.out.println("Soma: " + reduceSoma);

        Integer reduceMulti = list.stream()
                .reduce(1, (a,b) -> a * b);
        System.out.println("Multiplicacao: " + reduceMulti);

        Integer reduceMax = list.stream()
                .reduce(0, Integer::max);
        System.out.println("Maximo: " + reduceMax);


    }
}