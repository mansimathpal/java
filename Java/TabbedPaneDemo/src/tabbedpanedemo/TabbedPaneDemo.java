package tabbedpanedemo;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class TabbedPaneDemo extends JFrame{
      JTabbedPane obj;
      
      public TabbedPaneDemo()
      {
          obj = new JTabbedPane(JTabbedPane.BOTTOM);
          obj.addTab("Tab1", null);
          obj.addTab("Tab2", null);
          obj.setSize(100, 100);
          
          this.setTitle("JTabbedPane Demo");
          this.setVisible(true);
          this.setSize(300, 200);
          this.add(obj);
      }
    
    public static void main(String[] args) {
        TabbedPaneDemo tobj = new TabbedPaneDemo();
    }
}
