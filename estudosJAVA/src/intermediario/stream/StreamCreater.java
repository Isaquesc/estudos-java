package intermediario.stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCreater {
    public static void main(String[] args) throws IOException {

//        COLLECTION
        Arrays.asList(1, 2, 3, 4, 5, 6)
                .stream()
                .filter(y -> y % 2 == 0)
                .forEach(System.out::println);

//        ARRAYS
        Integer[] integers = {1, 2, 3, 4, 5};
        Arrays.stream(integers)
                .forEach(System.out::println);

//        STREAM.OF
        Stream.of("Se", "inscreva", "no", "canal", "!")
                .forEach(System.out::println);

//        STREM.ITERATE
        Stream.iterate(2,(n) -> n + 1)
                .limit(10)
                .filter((n) -> n < 11)
                .forEach(System.out::println);

/*
        BUFFEREDREADER - LINHAS
        STREAMS.TXT (11, 12, 13)
 */
        FileReader arquivoLido = new FileReader(new File("stream.txt"));
        try(BufferedReader bufferedReader = new BufferedReader(arquivoLido)){

            Stream<String> lines = bufferedReader.lines();
            String s = lines.collect(Collectors.joining(" "));
            
            System.out.println("♥ Tonzinho e Jessica ♥");
            System.out.println("Teste: " + s.substring(s.indexOf("Rua")));
        }
    }
}
