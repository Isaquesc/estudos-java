package intermediario.collections.devDojo.dominio;

import java.util.Objects;

public class Serie implements Comparable<Serie> {

    private Long id;
    private String nome;
    private int temporada;

    private int nota;

    public Serie(Long id, String nome, int temporada) {
        Objects.requireNonNull(id, "id não pode ser null");
        Objects.requireNonNull(nome, "nome não pode ser null");
        Objects.requireNonNull(temporada, "temporada não pode ser null");
        this.id = id;
        this.nome = nome;
        this.temporada = temporada;
    }

    public Serie(Long id, String nome, int temporada, int nota) {
        this(id, nome, temporada);
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", temporada=" + temporada +
                "}\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return Double.compare(temporada, serie.temporada) == 0 && Objects.equals(id, serie.id) && Objects.equals(nome, serie.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, temporada);
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    @Override
    public int compareTo(Serie outraSerie) {
//        negativo se o this < objtoParametro
//        if (this.getTemporada() < outraSerie.getTemporada())
//            return -1;

//        zero se this == objetoParametro
//        if (this.getTemporada() == outraSerie.getTemporada())
//            return 0;

//        positivo this > objetoParametro
//        return 1;

        return Integer.compare(this.temporada, outraSerie.getTemporada());
    }
}
