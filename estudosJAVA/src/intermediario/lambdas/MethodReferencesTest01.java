package intermediario.lambdas;

import intermediario.lambdas.dominio.Anime;
import intermediario.lambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferencesTest01 {
    public static void main(String[] args) {

        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 43), new Anime("One piece", 100), new Anime("Naruto", 500)));

//        animeList.sort(animeList, (a1, a2) -> a1.getTitle().compareTo(a2.getTitle()));
//        animeList.sort(animeList, AnimeComparators::compareByTitle);
        animeList.sort(AnimeComparators::compareByEpisodes);
        System.out.println(animeList);

    }
}
