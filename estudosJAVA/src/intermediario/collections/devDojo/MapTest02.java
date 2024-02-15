package intermediario.collections.devDojo;

import intermediario.collections.devDojo.dominio.Consumidor;
import intermediario.collections.devDojo.dominio.Serie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest02 {

    public static void main(String[] args) {
        Consumidor c1 = new Consumidor("Isaque Silva");
        Consumidor c2 = new Consumidor("Jessica Bezerra");

        Serie serie1 = new Serie(1L, "Grey's Anatomy", 2);
        Serie serie2 = new Serie(3L, "Estacao 19", 1);
        Serie serie3 = new Serie(4L, "Mestre do Ar", 3);
        Serie serie4 = new Serie(2L, "Ruptura", 4);
        Serie serie5 = new Serie(5L, "Big Brother Brasil", 5);
        Serie serie6 = new Serie(7L, "FBI", 5);
        Serie serie7 = new Serie(6L, "Jack Ryan", 6);

        Map<Consumidor, List<Serie>> consumidorSerieMap = new HashMap<>();

        consumidorSerieMap.put(c1, List.of(serie1, serie2,serie3));
        consumidorSerieMap.put(c2, List.of(serie4, serie5,serie6));

        for(Map.Entry<Consumidor, List<Serie>> consumidorListEntry : consumidorSerieMap.entrySet()){
            System.out.println(consumidorListEntry.getKey().getNome());
            consumidorListEntry.getValue().forEach(c -> System.out.println(" - " + c.getNome()));
        }

    }
}
