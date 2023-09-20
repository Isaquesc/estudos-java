package iniciante.javaIOdevDojo;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest03 {
    public static void main(String[] args) throws IOException {
        Path dir = Paths.get("home/isaque");
        Path file = Paths.get("dev/texto.txt");
        Path resolve = dir.resolve(file);

        System.out.println(resolve);

        Path absoluto = Paths.get("/home/isaque");
        Path relativo = Paths.get("dev");
        Path arquivo = Paths.get("arquivo.txt");

        System.out.println("1 - " + absoluto.resolve(relativo));
        System.out.println("2 - " + absoluto.resolve(arquivo));
        System.out.println("3 - " + relativo.resolve(absoluto));
        System.out.println("4 - " + relativo.resolve(arquivo));
        System.out.println("5 - " + arquivo.resolve(absoluto));


    }
}
