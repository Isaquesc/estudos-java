package intermediario.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class MethodReferencesTest03 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(List.of("Isaque", "Jessica", "Tom"));

        list.sort(String::compareTo);
        System.out.println(list);

//        Function<String, Integer> numStringToInterger =  s -> Integer.parseInt(s);
        Function<String, Integer> numStringToInterger =  Integer::parseInt;
        Integer i = numStringToInterger.apply("10");
        System.out.println(i);

        BiPredicate<List<String>, String> checkName = List::contains;
        boolean test = checkName.test(list, "Isaque");
        System.out.println(test);

    }
}
