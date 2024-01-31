package intermediario.collections.devDojo;

import intermediario.collections.devDojo.dominio.Serie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SerieSorteByID implements Comparator<Serie> {
    @Override
    public int compare(Serie o1, Serie o2) {
        return o1.getId().compareTo(o2.getId());
    }
}

public class MangaSortTest01 {
    public static void main(String[] args) {

        List<Serie> series = new ArrayList<>(6);

        series.add(new Serie(1L, "Grey's Anatomy", 2));
        series.add(new Serie(3L, "Grey's Anatomy", 1));
        series.add(new Serie(4L, "Grey's Anatomy", 3));
        series.add(new Serie(2L, "Grey's Anatomy", 4));
        series.add(new Serie(5L, "Grey's Anatomy", 5));

//        Collections.sort(series, new SerieSorteByID());
        series.sort(new SerieSorteByID());
        System.out.println(series);

    }
}
