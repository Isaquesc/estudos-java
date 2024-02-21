package intermediario.optional.repositorio;

import intermediario.optional.dominio.Manga;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepository {

    private static List<Manga> list = List.of(
            new Manga(1, "Avatar", 50),
            new Manga(2, "Naruto", 25)
    );

    public static Optional<Manga> findByID(Integer id){
        return findBy(m -> m.getId().equals(id));
    }

    public static Optional<Manga> findByTitle(String title){
        return findBy(m -> m.getTitle().equals(title));
    }

    private static Optional<Manga> findBy(Predicate<Manga> predicate){
        Manga found = null;

        for (Manga manga : list) {
            if (predicate.test(manga))
                found = manga;
        }

        return Optional.ofNullable(found);
    }

}
