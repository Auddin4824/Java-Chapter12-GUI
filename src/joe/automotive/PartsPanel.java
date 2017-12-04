package joe.automotive;
import javax.swing.*;
import java.awt.*;

public class PartsPanel extends JPanel {
    //Constants for Parts
    public final double TIRES = 700.00;
    public final double SPARE_TIRE = 50.00;
    public final double OIL = 35.00;
    public final double WINDSHIELD_WASHER = 5.00;
    public final double BATTERY = 150.00;
    
    //Checkboxes for parts 
    private JCheckBox tires;
    private JCheckBox spareTire;
    private JCheckBox oil;
    private JCheckBox windshieldWasher;
    private JCheckBox battery;
    
    public PartsPanel() {
        setLayout(new GridLayout(5,1)); //Grid Layout Manager
        
        //Creates Checkboxes
        tires = new JCheckBox("Tires");
        spareTire = new JCheckBox("spareTire");
        oil = new JCheckBox("Oil");
        windshieldWasher = new JCheckBox("Windshield Washer");
        battery = new JCheckBox("Battery");
        
        //Add border...
        setBorder(BorderFactory.createTitledBorder("Parts"));
        
        //Add checkboxes to panel
        add(tires);
        add(spareTire);
        add(oil);
        add(windshieldWasher);
        add(battery);
    }
    
    //Methods for getting cost of parts
    public double getPartCost() {
        double partCost = 0.0;
        
        if (tires.isSelected())
          partCost += TIRES;
        if (spareTire.isSelected())
          partCost += SPARE_TIRE;
        if (oil.isSelected())
          partCost += OIL;
        if (windshieldWasher.isSelected())
          partCost += WINDSHIELD_WASHER;
        if (battery.isSelected())
          partCost += BATTERY;
      
        return partCost;
    }
}
