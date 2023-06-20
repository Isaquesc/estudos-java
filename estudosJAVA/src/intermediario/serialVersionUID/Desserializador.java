package intermediario.serialVersionUID;

import intermediario.serialVersionUID.domain.Clube;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Desserializador {

    public static void main(String[] args) throws Exception {

        FileInputStream fileInputStream = new FileInputStream("/tmp/saopaulo.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Clube saoPaulo = (Clube) objectInputStream.readObject();

        objectInputStream.close();

        System.out.println("Pronto, objeto Desserializado");
        System.out.println(saoPaulo);
    }
}
