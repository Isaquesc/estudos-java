package intermediario.serialVersionUID;

import intermediario.serialVersionUID.domain.Aluno;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SerializacaoTest01 {

    public static void main(String[] args) {

        serializar(new Aluno(3L, "Isaque Bezerra Silva", "Tomzinho", new Turma("Turma da Igreja")));
        deserializar();
    }

    private static void serializar(Aluno aluno) {
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(Paths.get("pasta/aluno.ser")))) {
            oos.writeObject(aluno);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void deserializar() {
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(Paths.get("pasta/aluno.ser")))) {
            Aluno aluno = (Aluno) ois.readObject();
            System.out.println(aluno);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
