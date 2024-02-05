package intermediario.collections.devDojo;

import intermediario.collections.devDojo.dominio.Serie;

import java.util.ArrayList;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetTest02 {
    public static void main(String[] args) {

//        Tree falha em obedecer o contrato do Set, ele não  utiliza o equals para verificar se dois elementos são iguais, ele se baseia no metodo compareTo
        NavigableSet<Serie> series = new TreeSet<>(((o1, o2) -> Double.compare(o1.getId(), o2.getId())));
        series.add(new Serie(1L, "Grey's Anatomy", 2));
        series.add(new Serie(3L, "Grey's Anatomy", 1));
        series.add(new Serie(4L, "Grey's Anatomy", 3));
        series.add(new Serie(2L, "Grey's Anatomy", 4));
        series.add(new Serie(5L, "Grey's Anatomy", 5));
        series.add(new Serie(7L, "Yrey's Bnatomy", 5)); // EXEMPLO
        series.add(new Serie(6L, "Grey's Anatomy", 6));

//        Imprimindo no modo de ordenaçao DES
        System.out.println(series.descendingSet());

//       METODOS DE COMPARAÇÃO
//       lower <
//       floor <=
//       higher >
//       ceiling >=

        Serie theWalkingDead = new Serie(6L, "The Walking Dead", 2);

        System.out.println("lower: " + series.lower(theWalkingDead).getId());
        System.out.println("floor: " + series.floor(theWalkingDead).getId());
        System.out.println("higher: " + series.higher(theWalkingDead).getId());
        System.out.println("ceiling: " + series.ceiling(theWalkingDead).getId());


    }
}
