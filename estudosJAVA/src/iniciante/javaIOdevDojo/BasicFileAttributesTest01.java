package iniciante.javaIOdevDojo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAttributesTest01 {

    public static void main(String[] args) throws IOException {

        LocalDateTime now = LocalDateTime.now().minusDays(10);
        File file = new File("novo.txt");
        boolean isNewFile = file.createNewFile();
        file.setLastModified(now.toInstant(ZoneOffset.UTC).toEpochMilli());

        Path path = Paths.get("novoFile.txt");
        Path file1 = Files.createFile(path);
        Files.setLastModifiedTime(path, FileTime.from(now.toInstant(ZoneOffset.UTC)));
        
    }
}
