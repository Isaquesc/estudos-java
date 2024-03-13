package intermediario.padroesdeprojeto.factory.exemplodois.dominio;

public class Homem extends Pessoa {
    public Homem(String nome) {
        this.nome = nome;
        this.SEXO = Sexo.MASCULINO;
        System.out.println("Olá senhor " + this.nome);
    }

    @Override
    public String toString() {
        return "Homem{" +
                "nome='" + nome + '\'' +
                ", SEXO=" + SEXO +
                '}';
    }
}
