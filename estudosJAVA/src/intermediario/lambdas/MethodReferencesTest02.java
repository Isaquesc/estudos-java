package intermediario.lambdas;

import intermediario.lambdas.dominio.Anime;
import intermediario.lambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

//Referência a um método de instância de um objeto específico
public class MethodReferencesTest02 {
    public static void main(String[] args) {

        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 43), new Anime("One piece", 100), new Anime("Naruto", 500)));
        AnimeComparators animeComparators = new AnimeComparators();

        animeList.sort(animeComparators::compareByEpisodesNoStatic);
//        animeList.sort((a, b) -> animeComparators.compareByEpisodesNoStatic(a, b));
        System.out.println(animeList);

    }

}
