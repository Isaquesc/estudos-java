package iniciante.javaIOdevDojo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.stream.Stream;

public class BasicFileAttributesTest02 {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("arquivoRenomeado.txt");

        //criando um objeto do tipo BasicFileAttributes para conseguir ler o patch mencionado
        LeituraPropriedades.getPropriedades(path).forEach(System.out::println);;

        //criando um objetivo do tipo BasicFileAttributesView, para consegue editar o patch mencionado.
        BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);


        System.out.println(ZoneId.systemDefault());

        fileAttributeView.setTimes(null, null, FileTime.from(Instant.parse("2023-10-26T11:00:00Z")));
        System.out.println("-----------------------");
        LeituraPropriedades.getPropriedades(path).forEach(System.out::println);
    }

    class LeituraPropriedades {

        static Stream<FileTime> getPropriedades(Path path) throws IOException {
            BasicFileAttributes leitura = Files.readAttributes(path, BasicFileAttributes.class);

            Stream<FileTime> fileTimeStream = Stream.of(leitura.creationTime(),
                    leitura.lastAccessTime(),
                    leitura.lastModifiedTime());

            return fileTimeStream;
        }

    }
}
