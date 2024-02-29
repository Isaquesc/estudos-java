package intermediario.stream.test;

import intermediario.stream.dominio.LightNovel;
import intermediario.stream.dominio.LightNovelListBuilder;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamTest06 {
    public static void main(String[] args) {

        List<LightNovel> lightNovels = LightNovelListBuilder.createrlightNovelList();

        System.out.println(lightNovels.stream()
                .anyMatch(lightNovel -> lightNovel.getPrice() > 8)); //Algum é maior que 8 ?

        System.out.println(lightNovels.stream()
                .allMatch(lightNovel -> lightNovel.getPrice() > 0)); //Todos são maiores que 0?

        System.out.println(lightNovels.stream()
                .noneMatch(lightNovel -> lightNovel.getPrice() > 0)); //Nenhum é maior que 0?

        lightNovels.stream()
                .filter( lightNovel -> lightNovel.getPrice() > 10)
                .findAny()
                .ifPresentOrElse(System.out::println, () -> System.out.println("Nenhum resultado obtido"));

        lightNovels.stream()
                .filter(lightNovel -> lightNovel.getPrice() > 2)
                .sorted(Comparator.comparing(LightNovel::getPrice))
                .limit(3)
                .forEach(System.out::println);

    }
}