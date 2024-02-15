package intermediario.collections.devDojo;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    public static void main(String[] args) {

        NavigableMap<String, String> map = new TreeMap<>();

        map.put("A", "Letra A");
        map.put("C", "Letra C");
        map.put("B", "Letra B");
        map.put("F", "Letra F");
        map.put("E", "Letra E");
        map.put("D", "Letra D");

        map.entrySet().forEach(c -> System.out.println(c.getKey() + " - " + c.getValue()));

        System.out.println(map.headMap("D", true));


    }
}
