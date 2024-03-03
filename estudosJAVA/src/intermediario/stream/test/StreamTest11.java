package intermediario.stream.test;

import intermediario.stream.dominio.Category;
import intermediario.stream.dominio.LightNovel;
import intermediario.stream.dominio.LightNovelListBuilder;

import java.sql.SQLOutput;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

//        === O PODER O FRAMEWORK COLLECT
        DoubleSummaryStatistics statistics = lightNovels.stream().collect(Collectors.summarizingDouble(LightNovel::getPrice));
        System.out.println(statistics);

        String string = lightNovels.stream().map(LightNovel::getTitle).collect(Collectors.joining(", "));
        System.out.println(string);

        Map<Boolean, List<LightNovel>> listMap = lightNovels.stream()
                .collect(Collectors.partitioningBy(c -> c.getPrice() > 2));

        listMap.forEach((a, b) ->
                System.out.println(a.toString()
                        + " " + b.stream()
                        .map(LightNovel::getTitle)
                        .toList()));

        Map<Category, List<LightNovel>> collect = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCATEGORIAS));
        System.out.println(collect);


    }
}