package intermediario.classeAnonima;

import intermediario.generics.dominio.Barco;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClasseAnonymous {

    class ComparatorBarcoByNome implements Comparator<Barco>{

        @Override
        public int compare(Barco o1, Barco o2) {
            return o1.getNome().compareTo(o2.getNome());
        }
    }
    public static void main(String[] args) {

        List<Barco> barcos = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));

//        ==== ANTIGA SINTAX
        barcos.sort(new Comparator<Barco>() {
            @Override
            public int compare(Barco o1, Barco o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        });

//        ==== NOVA SINTAX
        barcos.sort(((o1, o2) -> o1.getNome().compareTo(o2.getNome())));

        System.out.println(barcos);
    }
}
