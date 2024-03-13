package intermediario.padroesdeprojeto.factory.exemplodois.test;

import intermediario.padroesdeprojeto.factory.exemplodois.dominio.FactoryPessoa;
import intermediario.padroesdeprojeto.factory.exemplodois.dominio.Pessoa;
import intermediario.padroesdeprojeto.factory.exemplodois.dominio.Sexo;

public class TesteApp {
    public static void main(String[] args) {
        Pessoa pessoa = new FactoryPessoa().getPessoa("Jessica", Sexo.MASCULINO);
        System.out.println(pessoa);
    }
}