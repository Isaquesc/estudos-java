package intermediario.stream.test;

import intermediario.stream.dominio.LightNovel;
import intermediario.stream.dominio.LightNovelListBuilder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest04 {
    public static void main(String[] args) {

        List<List<String>> cursos = new ArrayList<>();

        List<String> graphicDesigners = List.of("Wildnei Suane", "Catarina Santos", "Sandy Carolina");
        List<String> developers = List.of("William", "David", "Harisson");
        List<String> students = List.of("Édipo", "Gustavo Lima", "Gustavo Mendes", "Guilherme");

        cursos.add(graphicDesigners);
        cursos.add(developers);
        cursos.add(students);

        for (List<String> curso : cursos) {
            for (String aluno : curso) {
                System.out.println(aluno);
            }
        }

        System.out.println("----------");

        cursos.stream()
                .flatMap(Collection::stream)
                .forEach(System.out::println);

    }
}