package intermediario.serialVersionUID;

import intermediario.serialVersionUID.domain.Clube;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.Month;

public class Serializador {
    public static void main(String[] args) throws Exception {

        Clube saoPaulo = new Clube();
        saoPaulo.setNome("São Paulo Futebol Clube");
        saoPaulo.setTitulo(41);
        saoPaulo.setNascimento(LocalDate.of(1930, Month.JANUARY, 27));
        saoPaulo.setHino("Blablabla");

        FileOutputStream fileOutputStream = new FileOutputStream("pasta/saopaulo.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(saoPaulo);
        objectOutputStream.close();

        System.out.println("Pronto, objeto serializado");

    }
}