package intermediario.stream.test;

import intermediario.stream.dominio.LightNovelListBuilder;
import intermediario.stream.dominio.LightNovel;

import java.util.Comparator;
import java.util.List;

public class StreamTest02 {

    public static void main(String[] args) {

        List<LightNovel> lightNovels = LightNovelListBuilder.createrlightNovelList();

//        ==== 1. Encomende LightNovel por título
//        ==== 2. Recupere os 3 primeiros títulos de light novels com preço inferior a 4

        lightNovels.stream()
                .sorted(Comparator.comparing(LightNovel::getTitle))
                .filter(m -> m.getPrice() <= 4)
                .limit(3)
                .map(LightNovel::getTitle)
                .toList()
                .forEach(System.out::println);
    }
}
