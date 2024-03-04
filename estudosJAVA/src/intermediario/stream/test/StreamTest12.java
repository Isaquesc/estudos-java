package intermediario.stream.test;

import intermediario.stream.dominio.Category;
import intermediario.stream.dominio.LightNovel;
import intermediario.stream.dominio.LightNovelListBuilder;
import intermediario.stream.dominio.Promotion;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import static intermediario.stream.dominio.Promotion.NORMAL_PRICE;
import static intermediario.stream.dominio.Promotion.UNDER_PROMOTION;

public class StreamTest12 {
    public static void main(String[] args) {

        System.out.println(Runtime.getRuntime().availableProcessors());

        long num = 10_000_00;
        sumFor(num);
        sumStreamInterate(num);
        sumParallelStreamInterate(num);

    }

    private static void sumFor(long num) {
        System.out.print("executando sumFOr: ");
        long result = 0;
        long init = System.currentTimeMillis();

        for (int i = 0; i <= num; i++) {
            result += i;
        }

        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumStreamInterate(long num) {
        System.out.print("executando sumStreamInterate: ");
        long init = System.currentTimeMillis();

        long result = Stream.iterate(1L, c -> c + 1)
                .limit(num)
                .reduce(0L, Long::sum);

        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumParallelStreamInterate(long num) {
        System.out.print("executando sumParallelStreamInterate: ");
        long init = System.currentTimeMillis();

        long result = LongStream.rangeClosed(1L, num)
//                .parallel()
                .reduce(0L, Long::sum);

        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }
}