package intermediario.excercicioMeclarNomes;

import java.util.HashSet;
import java.util.Set;

public class MesclarNomesTest {

    public static Set<String> uniqueNames(String[] names1, String[] names2) {
        Set<String> nomes = new HashSet<>();

        for (String nome : names1) {
            nomes.add(nome);
            for (String nome2 : names2) {
                nomes.add(nome2);
            }
        }
        return nomes;
    }

    public static void main(String[] args) {

        String[] names1 = new String[]{"Ava", "Emma", "Olivia"};
        String[] names2 = new String[]{"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", uniqueNames(names1, names2)));
        // should print Ava, Emma, Olivia, Sophia

    }
}
