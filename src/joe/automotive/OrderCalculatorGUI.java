package joe.automotive;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class OrderCalculatorGUI extends JFrame {
    //Created Panels
    private ServicePanel service;
    private PartsPanel parts;
    private GreetingPanel banner;
    
    //Create a Panel for buttons
    private JPanel buttonPanel;
    private JButton calcButton;
    private JButton exitButton;
        
    public OrderCalculatorGUI() {
        //General GUI setup
        setTitle("Order Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout()); //Border Layout Manager
            
        //Link Created Panel
        banner = new GreetingPanel();
        service = new ServicePanel();
        parts = new PartsPanel();
            
        //Created Calculate and Exit Button
        buildButtonPanel();

        //Add components to window
        add(banner, BorderLayout.NORTH);
        add(service, BorderLayout.WEST);
        add(parts, BorderLayout.EAST);
        add(buttonPanel, BorderLayout.SOUTH);
            
        //Pack contents of window and show it
        pack();
        setVisible(true);
    }
        
    public void buildButtonPanel() {
        //Panel for buttons
        buttonPanel = new JPanel();
            
        //Created buttons
        calcButton = new JButton("Calculate");
        exitButton = new JButton("Exit");
            
        //Add events listeners to them
        calcButton.addActionListener(new CalcButtonListener());
        exitButton.addActionListener(new ExitButtonListener());
            
        //Added them to panel
        buttonPanel.add(calcButton);
        buttonPanel.add(exitButton);
        }
    
    //Calculates and display information
    private class CalcButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double serviceCost, laborCost, partCost, total;
        
            serviceCost = service.getServiceCost(); 
            laborCost = service.getLaborCost();
            partCost = parts.getPartCost();
            total = serviceCost + laborCost + partCost;
            
            JOptionPane.showMessageDialog(null, " Your grand total is $" + 
                    total 
                    + ". The total cost of labor for your reference is $" + 
                    laborCost);
            
            System.exit(0);
            }
            
    }
    
    //Exits application
    private class ExitButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
    
    //Starts GUI!
    public static void main(String[] args) {
             new OrderCalculatorGUI();
    }
}
