package mainclass;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.EnumSet;

class SearchDemo implements FileVisitor{
    private final PathMatcher matcher;
    int counter = 0;
    
    public SearchDemo(String pattern){
        FileSystem fs = FileSystems.getDefault();
        matcher = fs.getPathMatcher("glob:" + pattern);
    }
    
    void search(Path file) throws IOException{
        Path name = file.getFileName();
        
        if(name != null && matcher.matches(name)){
            System.out.println("Searched file located: " + name + " in " + file.getParent().toAbsolutePath());
            counter++;
        }
    }
    
    public FileVisitResult postVisitDirectory(Object dir, IOException exc) throws IOException{
        return FileVisitResult.CONTINUE;
    }
    
    public FileVisitResult preVisitDirectory(Object dir, BasicFileAttributes attrs) throws IOException
    {
        return FileVisitResult.CONTINUE;
    }
    
    public FileVisitResult visitFile(Object file, BasicFileAttributes attrs) throws IOException{
        search((Path) file);
        return FileVisitResult.CONTINUE;
    }
    
    public FileVisitResult visitFileFailed(Object file, IOException exc) throws IOException{
        return FileVisitResult.CONTINUE;
    }
}

public class MainClass {
    public static void main(String[] args) throws IOException{
        String pattern = "*.java";
        Path fileTree = Paths.get("E:/");
        SearchDemo walk = new SearchDemo(pattern);
        EnumSet opts = EnumSet.of(FileVisitOption.FOLLOW_LINKS);
        Files.walkFileTree(fileTree, opts, Integer.MAX_VALUE, walk);
        System.out.println("Total files found: " + walk.counter);
    }
}
