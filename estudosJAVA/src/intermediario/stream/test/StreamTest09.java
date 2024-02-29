package intermediario.stream.test;

import intermediario.stream.dominio.LightNovel;
import intermediario.stream.dominio.LightNovelListBuilder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest09 {
    public static void main(String[] args) throws IOException {

        IntStream.range(1,10)
                .forEach(n -> System.out.print(n + " "));
        System.out.println();

        IntStream.rangeClosed(1,10)
                .forEach(n -> System.out.print(n + " "));
        System.out.println();

        Stream.of("isso", "criara", "um", "stream", "de", "string")
                .map(String::toUpperCase)
                .forEach(s -> System.out.print(s + " "));

        int num[]  = {1, 2, 3, 4};
        IntStream stream = Arrays.stream(num);
        System.out.println();

        Stream<String> lines = Files.lines(Paths.get("teste.txt"));
        Stream<String> lines2 = Files.lines(Paths.get("teste.txt"));

        lines.map(linhas -> linhas.split(" "))
                .flatMap(Arrays::stream)
                .filter(palavra -> palavra.equals("Java"))
                .forEach(System.out::println);

        lines2.filter(linhas -> linhas.contains("Java"))
                .forEach(System.out::println);

    }
}