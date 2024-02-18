package intermediario.generics;

import java.util.ArrayList;
import java.util.List;

public class WildcardTest02 {
    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());
        List<Animal> animalList = new ArrayList<>();

        printConsulta(cachorros);
        printConsultaAdicionar(animalList);
    }

    private static void printConsulta(List<? extends Animal> animals) {
        for (Animal animal : animals)
            animal.consulta();
    }

    private static void printConsultaAdicionar(List<? super Animal> animals) {
        animals.add(new Gato());
        animals.add(new Cachorro());

        for (Object o : animals)
            if (o instanceof Animal)
                ((Animal) o).consulta();
    }
}
