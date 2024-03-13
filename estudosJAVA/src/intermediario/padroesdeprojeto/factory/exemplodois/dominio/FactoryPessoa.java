package intermediario.padroesdeprojeto.factory.exemplodois.dominio;

public class FactoryPessoa {
    public Pessoa getPessoa(String nome, Sexo sexo) {
        if (sexo.equals(Sexo.MASCULINO)) {
            return new Homem(nome);
        }
        if (sexo.equals(Sexo.FEMININO)) {
            return new Mulher((nome));
        }
        return null;
    }
}
