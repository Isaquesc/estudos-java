package intermediario.collections.devDojo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTeste01 {
    public static void main(String[] args) {

        List<String> mangas = new ArrayList<>();

        mangas.add("Hellsing Ultimate");
        mangas.add("Berserk");
        mangas.add("Pokemon");
        mangas.add("Attack on titan");
        mangas.add("Dragon ball Z");


        System.out.println(mangas);
        Collections.sort(mangas);
        System.out.println(mangas);


        List<Double> valor = new ArrayList<>();

        valor.add(100.01);
        valor.add(23.99);
        valor.add(19.99);
        valor.add(15.99);
        valor.add(99.95);

        System.out.println(valor);
        Collections.sort(valor);
        System.out.println(valor);

    }
}
