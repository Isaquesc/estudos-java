package intermediario.stream.dominio;

import java.util.ArrayList;
import java.util.List;

public class LightNovelListBuilder {

    public static List<LightNovel> createrlightNovelList() {
        List<LightNovel> lightNovels = new ArrayList<>(List.of(
                new LightNovel("Tensei Shittara", 8.99, Category.DRAMA),
                new LightNovel("Overlord", 3.99, Category.FANTASY),
                new LightNovel("Violet Evergarden", 5.99,Category.DRAMA),
                new LightNovel("No Game no life", 2.99,Category.FANTASY),
                new LightNovel("Fullmetal Alchemist", 5.99, Category.FANTASY),
                new LightNovel("Kumo desuga", 1.99,Category.ROMANCE),
                new LightNovel("Kumo desuga", 1.99, Category.ROMANCE),
                new LightNovel("Monogatari", 4.00, Category.ROMANCE)
        ));
        return lightNovels;
    }
}
