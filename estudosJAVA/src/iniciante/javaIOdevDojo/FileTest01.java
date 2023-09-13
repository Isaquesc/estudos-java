package iniciante.javaIOdevDojo;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;

public class FileTest01 {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\iscosta2\\Documents\\ProjetosPessoais\\estudosJAVA\\estudosJAVA\\arquivo\\file.txt");

        try {
            file.createNewFile();
            System.out.println("criou? - " + file.exists());
            System.out.println("path - " + file.getPath());
            System.out.println("path - " + file.getAbsolutePath());
            System.out.println("is directory - " + file.isDirectory());
            System.out.println("is file - " + file.isFile());
            System.out.println("is hidden - " + file.isHidden());
            System.out.println("last modified - " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()));

            if (file.exists())
                System.out.println("deletou? - " + file.delete());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
