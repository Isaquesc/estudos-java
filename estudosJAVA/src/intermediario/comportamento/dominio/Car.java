package intermediario.comportamento.dominio;

public class Car {
    private String nome;
    private String cor;
    private Integer ano;

    public Car(String nome, String cor, Integer ano) {
        this.nome = nome;
        this.cor = cor;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Car{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", ano=" + ano +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }

    public Integer getAno() {
        return ano;
    }
}
