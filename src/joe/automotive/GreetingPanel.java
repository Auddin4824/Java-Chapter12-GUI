package joe.automotive;
import javax.swing.*;

public class GreetingPanel extends JPanel {
    private JLabel greeting; //Label for greeting
    
    public GreetingPanel() {
        greeting = new JLabel("Welcome to Joe's Automotive."); //create label
        
        add(greeting); //Add label to panel
    }
}
