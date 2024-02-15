package intermediario.collections.devDojo;

import intermediario.collections.devDojo.dominio.Consumidor;
import intermediario.collections.devDojo.dominio.Serie;

import java.util.HashMap;
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

        Map<Consumidor, Serie> consumidorSerieMap = new HashMap<>();

        consumidorSerieMap.put(c1, serie2);
        consumidorSerieMap.put(c2, serie1);

        consumidorSerieMap.entrySet().forEach( entry -> System.out.println(entry.getKey().getNome() + " - " + entry.getValue().getNome()));

    }
}
