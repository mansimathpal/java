package filereaderdemo;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) {
        try(FileReader f = new FileReader("E:\\mansi.txt")) {
            char[] a = new char[50];
            f.read(a);
            for(char c : a)
            {
                System.out.println(c);
            }
            
        } 
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
