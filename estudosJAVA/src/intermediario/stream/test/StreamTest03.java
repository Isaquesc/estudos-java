package intermediario.stream.test;

import intermediario.stream.dominio.LightNovel;
import intermediario.stream.dominio.LightNovelListBuilder;

import java.util.List;

public class StreamTest03 {
    public static void main(String[] args) {

        List<LightNovel> lightNovels = LightNovelListBuilder.createrlightNovelList();
        lightNovels.forEach(System.out::println);

        long count = lightNovels.stream()
                .distinct()
                .filter(c -> c.getPrice() <= 4)
                .count();

        System.out.println(count);
    }
}