package intermediario.optional;

import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    public static void main(String[] args) {

        Optional<String> optional1 = Optional.of("Jesus é top");
        Optional<String> optional2 = Optional.ofNullable(null);
        Optional<String> optional3 = Optional.empty();

//        System.out.println(optional1);
//        System.out.println(optional2);
//        System.out.println(optional3);

        String resultName = Optional.ofNullable(findName("Elias")).orElse("name not found");
        System.out.println(resultName);
    }

    private static String findName(String name){
        List<String> list = List.of("Isaque", "Silva");
        int i = list.indexOf(name);
        if (i != -1 )
            return list.get(i);

        return null;
    }
}
