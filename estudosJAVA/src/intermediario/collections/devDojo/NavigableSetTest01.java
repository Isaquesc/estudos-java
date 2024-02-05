package intermediario.collections.devDojo;

import intermediario.collections.devDojo.dominio.Serie;
import intermediario.collections.devDojo.dominio.SmartPhone;

import java.util.*;

public class NavigableSetTest01 {
    public static void main(String[] args) {

        //Normalmente as classes que contem tree na nomeclatura necessita de uma implementação do Comparator
        //TreeSet vai fazer a organização da coleção de acordo com a implementação do compareTo
        NavigableSet<SmartPhone> set = new TreeSet<>(Comparator.comparing(SmartPhone::getMarca));
        set.add(new SmartPhone("123", "iPhone"));

    }
}
