package intermediario.collections.devDojo;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("teklado", "teclado");
        map.put("mouze", "mouse");
        map.put("vc", "você");
        map.putIfAbsent("vc", "você2"); //com esse metodo só vai inserir se não existir uma chave igual


        System.out.println(map.keySet()); //retorna um Set, porque não existe nenhuma chave duplicada;
        System.out.println(map.values());

        map.entrySet().forEach(entry -> System.out.println(entry.getValue() + " " + entry.getKey()));

        for (Map.Entry<String, String> entry : map.entrySet())
            System.out.println(entry.getValue() + " " + entry.getKey());


    }
}
