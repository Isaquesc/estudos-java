package intermediario.serialVersionUID.domain;



import java.io.Serializable;
import java.time.LocalDate;

public class Clube implements Serializable {

    private static final long serialVersionUID = 1L;

    String nome;
    int titulo;
    LocalDate nascimento;

    transient String hino;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTitulo() {
        return titulo;
    }

    public void setTitulo(int titulo) {
        this.titulo = titulo;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public String getHino() {
        return hino;
    }

    public void setHino(String hino) {
        this.hino = hino;
    }
}
