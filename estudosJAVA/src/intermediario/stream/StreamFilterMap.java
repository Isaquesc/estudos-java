package intermediario.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Cursos {

    private String nome;
    private Integer alunos;

    public Cursos(String nome, Integer alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public Integer getAlunos() {
        return alunos;
    }

    public void setAlunos(int n){
        this.alunos = n;
    }

    @Override
    public String toString() {
        return "CURSO: " + this.nome + " - ALUNOS: " + this.alunos;
    }
}

class ExemploCursos {
    public static void main(String[] args) {

        List<Cursos> listaCursos = new ArrayList<Cursos>();

        listaCursos.add(new Cursos("Python", 45));
        listaCursos.add(new Cursos("JavaScript", 150));
        listaCursos.add(new Cursos("Java 8 ", 113));
        listaCursos.add(new Cursos("C", 55));

//        ==== COMPARANDO PELO NUMERO DE ALUNOS (COM METODO REFERENCES)
        listaCursos.sort(Comparator.comparingInt(Cursos::getAlunos));

//        ==== FILTRANDO UMA LISTA DE OBJETOS e SOMANDO TUDO
        int sum = listaCursos.stream()
                .filter(cursos -> cursos.getAlunos() >= 100)
                .mapToInt(Cursos::getAlunos).sum();

//        ==== FILTRANDO O PRIMEIRO CURSO COM MAIS DE 100 ALUNOS
        Optional<Cursos> cursos1 = listaCursos.stream()
                .filter(cursos -> cursos.getAlunos() > 100)
                .findAny();

//        ==== RETORNANDO UM CURSO OU NULL
        Cursos curso = cursos1.orElse(null);
//        System.out.println(curso);

//        === INTERANDO PELO STREAMCURSOS
//        listaCursos.stream()
//                .iterator()
//                .forEachRemaining(System.out::println);

//        === RETORNANDO TAMANHO DO STREAM
        long sizeStream = listaCursos.stream()
                .spliterator().estimateSize();

//        === ALLMATCH VERIFICA SE HÁ ALGUM TOTAL DE ALUNO DIVIDO POR 2
        boolean b = listaCursos.stream()
                .anyMatch(cursos -> {
                    return cursos.getAlunos() % 2 != 0;
                });

//        === CONVERTENDO STREAM PARA UMA LIST
        listaCursos = listaCursos.stream()
                .filter(cursos -> cursos.getAlunos() > 100)
                .collect(Collectors.toList());

//        === CONVERTENDO STREAM PARA UM MAP
        listaCursos.stream()
                .filter(cursos -> cursos.getAlunos() > 100)
                .collect(Collectors.toMap(
                        Cursos::getNome,
                        Cursos::getAlunos));
//                .forEach((nome, aluno) -> System.out.println("[CURSO: " + nome + " | ALUNOS: " + aluno + "]"));
    }}