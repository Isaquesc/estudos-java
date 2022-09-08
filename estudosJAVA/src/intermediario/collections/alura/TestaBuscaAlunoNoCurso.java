package intermediario.collections.alura;

public class TestaBuscaAlunoNoCurso {


    public static void main(String[] args) throws Exception {

        Curso java = new Curso("Generations Brasil", "Rafael");

        java.adiciona(new Aula("Modulo1", 20));
        java.adiciona(new Aula("Modulo2", 21));
        java.adiciona(new Aula("Modulo3", 22));

        Aluno one = new Aluno("Isaque", 101010);
        Aluno dois = new Aluno("Jessica", 101011);
        Aluno tres = new Aluno("Felipe", 101012);

        java.matricula(one);
        java.matricula(dois);
        java.matricula(tres);

        System.out.println("Quem é o aluno com a matricula 101010?");
        Aluno aluno = java.buscaMatriculado(101010);
        System.out.println(aluno);

    }
}
