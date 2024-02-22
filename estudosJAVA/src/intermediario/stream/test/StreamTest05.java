package intermediario.stream.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest05 {
    public static void main(String[] args) {

//        ==== separar a string e letra-por-letra ex: G O M U 
        List<String> words = List.of("Gomu", "Gomu", "No", "Mi");
        String[] letters = words.get(0).split("");
        System.out.println(Arrays.toString(letters));

//        ==== usando map
        words.stream()
                .map(w -> w.split(""))
                .toList()
                .forEach(System.out::println);

        Stream<String> stream = Arrays.stream(letters);

        words.stream()
                .map(w -> w.split("")) //Stream<String[]>
                .flatMap(Arrays::stream) // Stream<String>
                .toList()
                .forEach(System.out::print);

    }
}