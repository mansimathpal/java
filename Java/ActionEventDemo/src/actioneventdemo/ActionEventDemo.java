package actioneventdemo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ActionEventDemo extends JFrame implements ActionListener{
    JButton click;
    JPanel panel;
    JLabel message;
    
    public ActionEventDemo()
    {
        super("Action Evengt Demo");
        click = new JButton("Click");
        panel = new JPanel();
        message = new JLabel();
        
        add(panel);
        panel.add(click);
        panel.add(message);
        
        setSize(300, 500);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        message.setText("Welcome to event handling in java");
    }
    
     public static void main(String[] args) {
         ActionEventDemo obj = new ActionEventDemo();
    }
}
