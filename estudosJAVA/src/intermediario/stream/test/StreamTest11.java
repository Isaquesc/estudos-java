package intermediario.stream.test;

import intermediario.stream.dominio.Category;
import intermediario.stream.dominio.LightNovel;
import intermediario.stream.dominio.LightNovelListBuilder;
import intermediario.stream.dominio.Promotion;

import java.sql.SQLOutput;
import java.util.*;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static intermediario.stream.dominio.Promotion.NORMAL_PRICE;
import static intermediario.stream.dominio.Promotion.UNDER_PROMOTION;

public class StreamTest11 {
    public static void main(String[] args) {

        List<LightNovel> lightNovels = LightNovelListBuilder.createrlightNovelList();

//        === COUNT
        System.out.println("count " + lightNovels.size());
        System.out.println("count " + lightNovels.stream().count());
        System.out.println("count " + lightNovels.stream().collect(Collectors.counting()));

//        === MAXIMO
        lightNovels.stream().max(Comparator.comparing(LightNovel::getPrice)).ifPresent(lightNovel -> System.out.println("max " + lightNovel));
        lightNovels.stream().collect(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))).ifPresent(lightNovel -> System.out.println("max " + lightNovel));

//        === MINIMO
        lightNovels.stream().collect(Collectors.minBy(Comparator.comparing(LightNovel::getPrice))).ifPresent(lightNovel -> System.out.println("min " + lightNovel));

//        === SOMA
        System.out.println("sum " + lightNovels.stream().mapToDouble(LightNovel::getPrice).sum());
        System.out.println("sum " + lightNovels.stream().collect(Collectors.summingDouble(LightNovel::getPrice)));//

//        === MEDIA
        lightNovels.stream().mapToDouble(LightNovel::getPrice).average().ifPresent(lightNovel -> System.out.println("average " + lightNovel));
        System.out.println("average " + lightNovels.stream().collect(Collectors.averagingDouble(LightNovel::getPrice)));

//        === O PODER O FRAMEWORK COLLECT (ESTATISTICAS)
        DoubleSummaryStatistics statistics = lightNovels.stream().collect(Collectors.summarizingDouble(LightNovel::getPrice));
        System.out.println(statistics);

        String string = lightNovels.stream().map(LightNovel::getTitle).collect(Collectors.joining(", "));
        System.out.println(string);

//        ===PARTITICIONBY
        Map<Boolean, List<LightNovel>> listMap = lightNovels.stream()
                .collect(Collectors.partitioningBy(c -> c.getPrice() > 2));

        listMap.forEach((a, b) ->
                System.out.println(a.toString()
                        + " " + b.stream()
                        .map(LightNovel::getTitle)
                        .toList()));

//        === GROUPBY
        Map<Category, List<LightNovel>> collect = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCATEGORIAS));
        System.out.println(collect);

//        === GROUPBY
        Map<Promotion, List<LightNovel>> collect2 = lightNovels.stream()
                .collect(Collectors
                        .groupingBy(c -> c.getPrice() < 6 ? UNDER_PROMOTION : NORMAL_PRICE));
        System.out.println(collect2);

//        === GROUPBY
        Map<Category, Map<Promotion, List<LightNovel>>> collect3 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCATEGORIAS,
                        Collectors.groupingBy(c -> c.getPrice() < 6 ? UNDER_PROMOTION : NORMAL_PRICE)));
        System.out.println(collect3);

//          === GROUPBY
        Map<Category, Long> collect4 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCATEGORIAS, Collectors.counting()));
        System.out.println(collect4);

//          === GROUPBY
        Map<Category, Optional<LightNovel>> collect5 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCATEGORIAS, Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))));
        System.out.println(collect5);

//          === GROUPBY
        Map<Category, LightNovel> collect6 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCATEGORIAS, Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)), Optional::get)));
        System.out.println(collect6);

//          === GROUPBY
        Map<Category, LightNovel> collect7 = lightNovels.stream()
                .collect(Collectors.toMap(LightNovel::getCATEGORIAS, Function.identity(), BinaryOperator.maxBy(Comparator.comparing(LightNovel::getPrice))));
        System.out.println(collect7);

//         === GROUPBY
        Map<Category, DoubleSummaryStatistics> collect8 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCATEGORIAS, Collectors.summarizingDouble(LightNovel::getPrice)));
        System.out.println(collect8);

//         === GROUPBY
        Map<Category, Set<Promotion>> collect1 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCATEGORIAS, Collectors.mapping(c -> c.getPrice() < 6 ? UNDER_PROMOTION : NORMAL_PRICE, Collectors.toSet())));
        System.out.println(collect1);

    }
}