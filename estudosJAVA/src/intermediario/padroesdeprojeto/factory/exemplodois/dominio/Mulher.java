package intermediario.padroesdeprojeto.factory.exemplodois.dominio;

public class Mulher extends Pessoa {
    public Mulher(String nome) {
        this.nome = nome;
        this.SEXO = Sexo.FEMININO;
        System.out.println("Olá senhora " + this.nome);
    }

    @Override
    public String toString() {
        return "Mulher{" +
                "nome='" + nome + '\'' +
                ", sexo='" + SEXO + '\'' +
                '}';
    }
}
