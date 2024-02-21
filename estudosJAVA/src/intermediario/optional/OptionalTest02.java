package intermediario.optional;

import intermediario.optional.dominio.Manga;
import intermediario.optional.repositorio.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {
        Manga mandaByID = MangaRepository.findByID(1).orElseThrow(IllegalArgumentException::new);
        System.out.println(mandaByID);

        Optional<Manga> optionalMangaByTitle = MangaRepository.findByTitle("Naruto");
        optionalMangaByTitle.ifPresent(c -> c.setTitle("Naruto 2"));
        System.out.println(optionalMangaByTitle);

        Manga manga = MangaRepository.findByTitle("Manga TESTE")
                .orElseGet(() -> new Manga(3, "Manga TESTE", 10));

        System.out.println(manga);
    }
}
