package algoritmos;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PesquisaBinariaTest01 {

    public static void main(String[] args) {

        Optional<Integer> i = pesquisaBinaria(List.of(1, 3, 5, 7, 9), 9);
        System.out.println(i);

    }

    public static Optional<Integer> pesquisaBinaria(List<Integer> lista, int item) {

        int baixo = 0;
        int alto = lista.size() - 1;

        while (baixo <= alto) {
            int meio = (baixo + alto) / 2;
            int chute = lista.get(meio);

            if (chute == item)
                return Optional.of(meio);

            if (chute > item)
                alto = meio;

            else
                baixo = meio + 1;
        }
        return Optional.empty();
    }
}
