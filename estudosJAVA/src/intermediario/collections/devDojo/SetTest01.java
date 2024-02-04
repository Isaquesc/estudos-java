package intermediario.collections.devDojo;

import intermediario.collections.devDojo.dominio.Serie;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {


        //Set não permite adicionar dois elementos iguais
        Set<Serie> series = new LinkedHashSet<>();

        series.add(new Serie(1L, "Grey's Anatomy", 2));
        series.add(new Serie(3L, "Grey's Anatomy", 1));
        series.add(new Serie(4L, "Grey's Anatomy", 3));
        series.add(new Serie(2L, "Grey's Anatomy", 4));
        series.add(new Serie(5L, "Grey's Anatomy", 5));
        series.add(new Serie(5L, "Grey's Anatomy", 5));

        for (Serie serie : series)
            System.out.print(serie);
    }
}
