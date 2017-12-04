package joe.automotive;
import javax.swing.*;
import java.awt.*;

public class ServicePanel extends JPanel {
    //Constants for Services
    public final double OIL_CHANGE = 26.00;
    public final double LUBE_JOB = 18.00;
    public final double RADIATOR_FLUSH = 30.00;
    public final double TRANSMISSION = 80.00;
    public final double INSPECTION = 15.00;
    public final double MUFFLER_REPLACEMENT = 100.00;
    public final double TIRE_ROTATION = 20.00;
    public final double LABOR = 20.00;
    double laborCost = 0.0; //For calculating labor cost
    
    //Checkboxes for services
    private JCheckBox oilChange;
    private JCheckBox lubeJob;
    private JCheckBox radiatorFlush;
    private JCheckBox transmission;
    private JCheckBox inspection;
    private JCheckBox mufflerReplacement;
    private JCheckBox tireRotation;
    
    public ServicePanel() {
        setLayout(new GridLayout(4,2)); //Grid Layout Manager
        
        //Creates Checkboxes
        oilChange = new JCheckBox("Oil Change");
        lubeJob = new JCheckBox("Lube Job");
        radiatorFlush = new JCheckBox("Radiator Flush");
        transmission = new JCheckBox("Transmission");
        inspection = new JCheckBox("Inspection");
        mufflerReplacement = new JCheckBox("Muffler Replacement");
        tireRotation = new JCheckBox("Tire Rotation");
        
        //Add border...
        setBorder(BorderFactory.createTitledBorder("Maintenance Services"));
        
        //Add checkboxes to panel
        add(oilChange);
        add(lubeJob);
        add(radiatorFlush);
        add(transmission);
        add(inspection);
        add(mufflerReplacement);
        add(tireRotation);
    }
    
    //Methods for getting cost of service and labor
    public double getServiceCost() {
        double serviceCost = 0.0;
        
        if (oilChange.isSelected()) {
          serviceCost += OIL_CHANGE;
          laborCost += LABOR;
        }
        if (lubeJob.isSelected()) {
            serviceCost += LUBE_JOB;
            laborCost += LABOR;
        }
        if (radiatorFlush.isSelected()) {
            serviceCost += RADIATOR_FLUSH;
            laborCost += LABOR;
        }
        if (transmission.isSelected()) {
            serviceCost += TRANSMISSION;
            laborCost += LABOR;
        }
        if (inspection.isSelected()) {
            serviceCost += INSPECTION;
            laborCost += LABOR;
        }
        if (mufflerReplacement.isSelected()) {
            serviceCost += MUFFLER_REPLACEMENT;
            laborCost += LABOR;
        }
        if (tireRotation.isSelected()) {
            serviceCost += TIRE_ROTATION;
            laborCost += LABOR;
        }
        
        return serviceCost;
    }
    
    //Returns labor cost
    public double getLaborCost() {
        return laborCost;
    }
}
