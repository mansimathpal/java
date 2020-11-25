package niodemo;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardCopyOption.COPY_ATTRIBUTES;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class NIODemo {
    public static void main(String[] args) {
        Path source = Paths.get("E:/Hello.java");
        Path target = Paths.get("E:/NIODemo/Hello.java");
        try {
            Files.copy(source, target, REPLACE_EXISTING, COPY_ATTRIBUTES);
        } 
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
