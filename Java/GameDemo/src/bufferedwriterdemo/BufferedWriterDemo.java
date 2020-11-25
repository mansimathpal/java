package bufferedwriterdemo;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class BufferedWriterDemo {
    public static void main(String[] args) {
        String content = "Using the BufferedWriter class to write to a file.";
        Path file = Paths.get("E:/NewFile.txt");
        Charset charset = Charset.forName("US-ASCII");
        try(BufferedWriter writer = Files.newBufferedWriter(file, charset, StandardOpenOption.CREATE)) {
            writer.write(content);
            System.out.println("Done");
        } 
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
