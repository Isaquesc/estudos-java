package intermediario.lambdas;

import intermediario.lambdas.dominio.Anime;
import intermediario.lambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class MethodReferencesTest04 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 43), new Anime("One piece", 100), new Anime("Naruto", 500)));

        Supplier<AnimeComparators> newAnimeComparators = AnimeComparators::new;
        AnimeComparators animeComparators = newAnimeComparators.get();

        animeList.sort(animeComparators::compareByEpisodesNoStatic);
        System.out.println(animeList);

//        BiFunction<String, Integer, Anime> animeBiFunction = (title, episodes) -> new Anime(title, episodes);
        BiFunction<String, Integer, Anime> animeBiFunction = Anime::new;

        animeList.add(animeBiFunction.apply("Super campeões", 36));
        System.out.println(animeList);

    }
}
