package intermediario.collections.devDojo;

import java.util.ArrayList;

public class ListTest01 {

    public static void main(String[] args) {

        ArrayList<String> listNome1 = new ArrayList<>(16);
        ArrayList<String> listNome2 = new ArrayList<>(16);

        listNome1.add("Isaque");
        listNome1.add("Jessica");
        listNome2.add("Elias");
        listNome2.add("Selma");

        listNome1.addAll(listNome2);
        listNome1.forEach(System.out::println);

    }
}
