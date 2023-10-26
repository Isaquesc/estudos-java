package iniciante.javaIOdevDojo;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class ListAllFiles02 extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs){

        if (file.getFileName().toString().endsWith(".java")) {
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {

        System.out.println("PRE VISIT: " + dir.getFileName());
        return FileVisitResult.CONTINUE;
    }


    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {

        System.out.println("POST VISIT: " + dir.getFileName());
        return FileVisitResult.CONTINUE;
    }
}

public class SimpleFileVisitorTest02 {
    public static void main(String[] args) throws IOException {

        Files.walkFileTree(Paths.get("pasta"), new ListAllFiles02());

    }
}
