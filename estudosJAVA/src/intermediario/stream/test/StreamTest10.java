package intermediario.stream.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest10 {
    public static void main(String[] args) throws IOException {

        Stream.iterate(1, n -> n + 2)
                .limit(5)
                .forEach(n -> System.out.print(n + " "));
        System.out.println();

        Stream.iterate(new int[]{0,1}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(10)
                .map(a -> a[0])
                .forEach(n -> System.out.print(n + " "));
        System.out.println();

        Stream.generate(() -> ThreadLocalRandom.current().nextInt(1, 500))
                .limit(10)
                .forEach(n -> System.out.print(n + " "));

    }
}