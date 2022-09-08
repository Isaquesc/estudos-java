package iniciante.tiposPrimitivos;

import java.util.ArrayList;

public class ArraysForeach {

    public static void main(String[] args) {

        ArrayList<String> listaNomes = new ArrayList<>();

        listaNomes.add("Isaque");
        listaNomes.add("Silva");

        for (String nome:listaNomes) {
            System.out.println(nome);
        }

    }
}
