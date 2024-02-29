package intermediario.stream.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest05 {
    public static void main(String[] args) {

//        === usando split para separar letra por letra
        List<String> listPalavras = List.of("Gomu", "Gomu", "No", "Mi");
        String[] letters = listPalavras.get(0).split("");
        System.out.println(Arrays.toString(letters));

//        === usando map
        listPalavras.stream()
                .map(w -> w.split(""))
                .toList();
//                .forEach(System.out::println);

//        === transformando Array em stream
        Stream<String> stream = Arrays.stream(letters);

        List<String> stringList = listPalavras.stream()
                .map(w -> w.split(""))
                .flatMap(Arrays::stream)
                .toList();
        System.out.println(stringList);
    }
}