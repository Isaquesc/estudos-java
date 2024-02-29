package intermediario.stream.dominio;

import java.util.ArrayList;
import java.util.List;

public class LightNovelListBuilder {

    public static List<LightNovel> createrlightNovelList() {
        List<LightNovel> lightNovels = new ArrayList<>(List.of(
                new LightNovel("Tensei Shittara", 8.99),
                new LightNovel("Overlord", 3.99),
                new LightNovel("Violet Evergarden", 5.99),
                new LightNovel("No Game no life", 2.99),
                new LightNovel("Fullmetal Alchemist", 5.99),
                new LightNovel("Kumo desuga", 1.99),
                new LightNovel("Kumo desuga", 1.99),
                new LightNovel("Monogatari", 4.00)
        ));
        return lightNovels;
    }
}
