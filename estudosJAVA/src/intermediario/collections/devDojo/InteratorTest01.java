package intermediario.collections.devDojo;

import intermediario.collections.devDojo.dominio.Serie;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InteratorTest01 {

    public static void main(String[] args) {

        List<Serie> series = new ArrayList<>(6);

        series.add(new Serie(1L, "Grey's Anatomy", 2, 5));
        series.add(new Serie(3L, "Grey's Anatomy", 1, 2));
        series.add(new Serie(4L, "Grey's Anatomy", 3, 0));
        series.add(new Serie(2L, "Grey's Anatomy", 4, 4));
        series.add(new Serie(5L, "Grey's Anatomy", 5, 0));

        Iterator<Serie> serieIterator = series.iterator();

        while (serieIterator.hasNext()){
            if (serieIterator.next().getNota() == 0)
                serieIterator.remove();
        }

//        NOVO MODO (JAVA 8)
//        series.removeIf(serie -> serie.getNota() == 0);

        System.out.println(series);
    }
}
