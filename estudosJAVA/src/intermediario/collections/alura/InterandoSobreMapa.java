package intermediario.collections.alura;

import java.util.HashMap;
import java.util.Map;

public class InterandoSobreMapa {

    public static void main(String[] args) {

        Map<Integer, String> pessoas = new HashMap<>();

        pessoas.put(21,"Isaque Silva");
        pessoas.put(22,"Jessica Silva");
        pessoas.put(23,"Iko Silva");
        pessoas.put(24,"Selma Silva");


        pessoas.keySet().forEach(idade -> {
            System.out.println(pessoas.get(idade));
        });

    }
}
