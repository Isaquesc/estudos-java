package intermediario.serialVersionUID.domain;

import intermediario.serialVersionUID.Turma;

import java.io.*;

public class Aluno implements Serializable {

    @Serial
    private static final long serialVersionUID = 1437288487844995709L;
    private Long id;
    private String nome;
    private transient String password;
    private final static String NOME_ESCOLA = "Heckel Tavares";
    private transient Turma turma;

    public Aluno(Long id, String nome, String password, Turma turma) {
        this.id = id;
        this.nome = nome;
        this.password = password;
        this.turma = turma;
    }

    @Serial
    private void writeObject(ObjectOutputStream oos) {
        try {
            oos.defaultWriteObject();
            oos.writeUTF(turma.getNome());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Serial
    private void readObject(ObjectInputStream oos) {
        try {
            oos.defaultReadObject();
            this.turma = new Turma(oos.readUTF());
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", password='" + password + '\'' +
                ", nomeEscola='" + NOME_ESCOLA + '\'' +
                ", turma='" + turma + '\'' +
                '}';
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
