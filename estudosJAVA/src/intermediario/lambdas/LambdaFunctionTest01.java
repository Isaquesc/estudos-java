package intermediario.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaFunctionTest01 {
    public static void main(String[] args) {

        List<String> list = List.of("Isaque", "Jessica");

        List<Integer> integerList = map(list, t -> t.length());
        System.out.println(integerList);

        List<String> stringLowerCase = map(list, t -> t.toUpperCase());
        System.out.println(stringLowerCase);
    }

//    Function e BiFuncion
//    Funcão que recebe um valor e retorna outro valor (do mesmo tipo ou diferente)
    private static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> listRetorno = new ArrayList<>();

        for (T t : list) {
            R r = function.apply(t);
            listRetorno.add(r);
        }

        return listRetorno;
    }
}
