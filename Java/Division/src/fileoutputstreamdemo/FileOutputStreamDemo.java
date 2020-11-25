package fileoutputstreamdemo;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException{
        boolean bool;
        long pos;
        String s = "This is aa FileOutputStream Program";
        byte buf[] = s.getBytes();
        try(FileOutputStream fos = new FileOutputStream("E:\\mansi.txt")) {
            for(int i = 0; i < buf.length; i++)
            {
                fos.write(buf[i]);
            }
        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
