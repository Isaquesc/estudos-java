package intermediario.stream.test;

import intermediario.stream.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamTest02 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No Game no life", 2.99),
            new LightNovel("Fullmetal Alchemist", 5.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Monogatari", 4.00)
    ));
    public static void main(String[] args) {

//        1. Encomende LightNovel por título
//        2. Recupere os 3 primeiros títulos de light novels com preço inferior a 4

        lightNovels.stream()
                .sorted(Comparator.comparing(LightNovel::getTitle))
                .filter(m -> m.getPrice() <= 4)
                .limit(3)
                .map(LightNovel::getTitle)
                .toList()
                .forEach(System.out::println);

    }
}
