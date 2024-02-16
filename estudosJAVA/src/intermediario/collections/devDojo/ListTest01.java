package intermediario.collections.devDojo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListTest01 {

    public static void main(String[] args) {

        ArrayList<String> listNome1 = new ArrayList<>(16);
        ArrayList<String> listNome2 = new ArrayList<>(16);

        listNome1.add("Isaque");
        listNome1.add("Jessica");
        listNome1.add("Elias");
        listNome1.add("Selma");

//        listNome1.addAll(listNome2);

        listNome1.forEach(System.out::println);
        Collections.sort(listNome1);
        System.out.println("------------ Ordem Alfabetica: ");
        listNome1.forEach(System.out::println);


    }
}
