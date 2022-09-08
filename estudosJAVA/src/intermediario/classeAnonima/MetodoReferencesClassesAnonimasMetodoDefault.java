package intermediario.classeAnonima;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class MetodoReferencesClassesAnonimasMetodoDefault {

    public static void main(String[] args) {

        List<String> palavras = new ArrayList<String>();

        palavras.add("Aesta a fantasia Sitio Ricardo");
        palavras.add("Cesta sexta-feira Gabriel");
        palavras.add("Besta Sabado");

//        ====== LAMBDA (CLASSE ANONIMA)
        System.out.println("========= MODO LAMBDA =========");
//        palavras.sort(Comparator.comparing(s -> s.length()));
        palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        palavras.forEach(s -> System.out.println(s));

//        ====== METODO REFERENCES
        System.out.println("========= MODO REFERENCES =========");
        palavras.sort(Comparator.comparing(String::length));
        palavras.forEach(System.out::println);

//        ====== CLASE ANONIMA "PURA"
        Function<String, Integer> funcao = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };

        Comparator<String> comparing = Comparator.comparing(funcao);
        palavras.sort(comparing);

//        ====== FOREACH "PURO"
        for (String p : palavras) {
            System.out.println(p);
        }


    }

    static class ImplimeNaLinha implements Consumer<String> {
        @Override
        public void accept(String s) {
            System.out.println(s);
        }

    }

    static class ComparadorPorTamanho implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            if (o1.length() < o2.length())
                return -1;
            if (o1.length() > o2.length())
                return 1;
            return 0;
        }
    }
}
