package intermediario.collections.devDojo;

import intermediario.collections.devDojo.dominio.Serie;
import intermediario.collections.devDojo.dominio.SmartPhone;

import java.util.*;

public class NavigableSetTest01 {
    public static void main(String[] args) {

        //Normalmente as classes que contem tree na nomeclatura necessita de uma implementação do Comparator
        NavigableSet<SmartPhone> set = new TreeSet<>(Comparator.comparing(SmartPhone::getMarca));

        set.add(new SmartPhone("123", "iPhone"));

        NavigableSet<Serie> series = new TreeSet<>();

        series.add(new Serie(1L, "Grey's Anatomy", 2));
        series.add(new Serie(3L, "Grey's Anatomy", 1));
        series.add(new Serie(4L, "Grey's Anatomy", 3));
        series.add(new Serie(2L, "Grey's Anatomy", 4));
        series.add(new Serie(5L, "Grey's Anatomy", 5));
        series.add(new Serie(5L, "Grey's Anatomy", 5));

        //TreeSet vai fazer a organização da coleção de acordo com a implementação do compareTo
        System.out.println(series);

    }
}
