package watchservicedemo;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardWatchEventKinds.ENTRY_CREATE;
import static java.nio.file.StandardWatchEventKinds.ENTRY_DELETE;
import static java.nio.file.StandardWatchEventKinds.ENTRY_MODIFY;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.nio.file.WatchEvent;
import java.nio.file.WatchEvent.Kind;

public class WatchServiceDemo {
    private Path path = null;
    WatchService watchService;
    
    private void initializeService(){
        path = Paths.get("E:/NIO");
        try {
            watchService = FileSystems.getDefault().newWatchService();
            path.register(watchService, ENTRY_CREATE, ENTRY_DELETE, ENTRY_MODIFY);
        } 
        catch (IOException e) {
            System.out.println("IOException" + e.getMessage());
        }
    }
    
    private void monitorDirectory(){
        WatchKey key = null;
        while(true){
            try {
                key = watchService.take();
                for(WatchEvent event : key.pollEvents()){
                    Kind kind = event.kind();
                    System.out.println("The event that occurred on " + event.context().toString() + "is" + kind);
                }
            } 
            catch (InterruptedException e) {
                System.out.println("InterruptedException: " + e.getMessage());
            }
            Boolean reset = key.reset();
            if(!reset)
                break;
        }
    }
    public static void main(String[] args) {
        WatchServiceDemo watchservicedemo = new WatchServiceDemo();
        watchservicedemo.initializeService();
        watchservicedemo.monitorDirectory();
    }
}
