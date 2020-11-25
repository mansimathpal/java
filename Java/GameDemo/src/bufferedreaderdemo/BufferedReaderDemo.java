package bufferedreaderdemo;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BufferedReaderDemo {
    public static void main(String[] args) {
        Path pathObject = Paths.get("E:/Hello.java");
        Charset charset = Charset.forName("US-ASCII");
        try(BufferedReader reader = Files.newBufferedReader(pathObject, charset)) {
            String line = null;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
            
        } 
        catch (IOException x) {
            System.out.println(x);
        }
    }
}
