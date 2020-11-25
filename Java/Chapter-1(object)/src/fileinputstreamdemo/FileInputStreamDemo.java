package fileinputstreamdemo;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) {
    int i;
    char c;
    try(FileInputStream f = new FileInputStream("E:\\mansi.txt"))
    {
        while((i = f.read()) != -1)
        {
            c = (char) i;
            System.out.println(c);
        }
    }
    catch(IOException ex)
    {
        System.out.println(ex);
    }
        
    }
}
