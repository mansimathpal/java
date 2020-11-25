package nio_demo;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;


public class NIOdemo {
    public static void main(String[] args) {
        Path source = Paths.get("E:/NIODemo/Hello.java");
        Path target = Paths.get("E:/NIODemo/NIO/Hello.java");
        try {
            Files.move(source, target, REPLACE_EXISTING);
        } 
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
