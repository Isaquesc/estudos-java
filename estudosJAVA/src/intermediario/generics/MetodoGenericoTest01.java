package intermediario.generics;

import intermediario.generics.dominio.Barco;

import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        List<Barco> barcoList = criarUmaListComUmObjeto(new Barco("Canoa Azul"));
        System.out.println(barcoList);


    }

    private static <T> List<T> criarUmaListComUmObjeto(T t){
        return List.of(t);
    }
}
